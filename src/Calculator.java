
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        String OP = scanner.next();
        int number2 = scanner.nextInt();
        switch (OP) {
            case "+":
                System.out.println("Сумма: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Разность: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Результат: " + (number1 * number2));
                break;
            case "/":
                System.out.println("Результат: " + (number1 / number2));
                break;
        }
    }
}
