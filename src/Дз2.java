import java.util.Random;
import java.util.Scanner;
public class Дз2 {
    public static void main (String[] args) {

        System.out.println("str:" + 5 +6);
        String formatted =
                String.format("Hello for %s from %s", "x", "y");
        System.out.println(formatted);
        System.out.printf("Hello for %s from %s", "x", "y");
        System.out.printf( "Number %.4f of %10d", 6.88, 8);

        int i = 0;
            while (i < 1000){
                i=i+100;
                formatted =String.format("Number %50s", i);
            System.out.println(formatted);

//                Random rnd = new Random();
//                Scanner sc = new Scanner(System.in);
//                while (true) {
//                    int number = rnd.nextInt();
//                    System.out.printf("Number: %d", number);
//                    String str = sc.nextLine();
//                   if (str.toLowerCase().equals("exit"))
//                   break;
//                   while ()
                }
        }

}
