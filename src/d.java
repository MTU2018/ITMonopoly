import java.util.Scanner;

public class d {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 2;
        String msg = "";
        while (x < 100){
            //System.out.println(x);
            x += 2;
            msg += " " + x;
        }

        System.out.println(msg);
}}
