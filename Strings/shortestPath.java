package Strings;

import java.util.*;

public class shortestPath {
    public static float shortest_path(String path){
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            }
            else if (path.charAt(i) == 'S'){
                y--;
            }
            else if (path.charAt(i) == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int xSquare = x*x;
        int ySquare = y*y;
        return (float)Math.sqrt(xSquare + ySquare);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String directions = sc.next();
        float result = shortest_path(directions.toUpperCase());
        System.out.println(result);
    }
}
