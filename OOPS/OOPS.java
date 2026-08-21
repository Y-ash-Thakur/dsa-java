package OOPS;

public class OOPS {
    public static void main(String[] args){
       Pen p1 = new Pen();
       p1.changeColor("blue");
        System.out.println(p1.color);

        p1.changeTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "yash Thakur";
        myAcc.setPassword("abcdefgh");
    }
}

class BankAccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        pwd = password;
    }
}

class Pen{
    String color;
    int tip;

    void changeColor(String newColor){
        color = newColor;
    }
    void changeTip(int tipSize){
        tip = tipSize;
    }
}