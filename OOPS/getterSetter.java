package OOPS;

public class getterSetter{
    static void main(String args []) {
        Pens p1 = new Pens();
        p1.setColor("blue");
        p1.setTip(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pens{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    int getTip(){
       return this.tip;
    }

    void setTip(int tipSize){
        this.tip = tipSize;
    }

}