import java.util.Scanner;

public class w {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
      int n1 = 0;
      int n2 = 1;
      int n = n1 + n2;

      while (n < 1000) {
       System.out.printf("%d ", n);
       n1 = n2;
       n2 = n;
       n = n1 + n2;
        }

        int number1 = scanner.nextInt();
        int n11 = 1;
        int n22 = 1;
        while (number1 > n22)
        n22 = n11 + n22;

        if (number1 == n22)
            System.out.println("yes");
        else System.out.println("no");

    }
}