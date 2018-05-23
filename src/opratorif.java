import java.util.Scanner;

public class opratorif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            int a = scanner.nextInt();
            if (a == 1)
                System.out.println("понедельник");
            if (a == 2)
                System.out.println("вторник");
            if (a == 3)
                System.out.println("среда");
            if (a == 4)
                System.out.println("четверг");
            if (a == 5)
                System.out.println("пятница");
            if (a == 6)
                System.out.println("суббота");
            if (a == 3)
                System.out.println("воскресенье");

            if (args.length > 0) {
                int a1 = Integer.parseInt(args[0]);
                switch (a1) {
                    case 1:
                        System.out.println("понедельник");
                        break;
                    case 2:
                        System.out.println("вторник");
                        break;
                    default:
                        System.out.println("не известный день");

                        Scanner scanner1 = new Scanner(System.in);
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


                        }