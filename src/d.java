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


        int n1 = 0;
        int n2 = 1;
        int n = n1+n2;

        while (n<1000){
            System.out.printf("%d ", n);
            n1 = n2;
            n2 = n;
            n = n1+n2;
        }
}}
