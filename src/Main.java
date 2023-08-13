import java.util.Scanner;

/**
 * @author 1ommy
 * @version 13.08.2023
 */
public class Main {

    public static void main(String[] args) {

        // ==, <, >
//
//        boolean isFlag = false;
//        boolean isFlag2 = true;
//
//        int ostatok = 10 % 3;
//        System.out.println(ostatok);
//
//        Scanner scanner = new Scanner(System.in);
//        int chislo = scanner.nextInt();
//        System.out.println("Последняя цифра числа: " + chislo % 10);
//        System.out.println("Число четное?: " + (chislo % 2 == 0));
//        System.out.println("Число нечетное?: " + (chislo % 2 != 0));
//
//        // && - логическое И
//        // || логическое или
//
//        String name = "Vanya";
//        int age = 18;
//
//
//        if (name != null && name.equals("Vanya") && age >= 18) {
//            System.out.println("Поздравляю, ты можешь купить пиво и отметить выходной");
//        }

//        if (isFlag) {
//            System.out.println("истина");
//        } else {
//            System.out.println("ложь");
//        }
//
//        int a = 5;
//        int b = 7;
//
//
//
//        System.out.println(a < b);
//        System.out.println(a > b);
//        System.out.println(a == b);

//
//        Scanner scanner = new Scanner(System.in);
//
//        double firstNumber;
//        double secondNumber;
//        int operation;
//
//        try {
//            System.out.println("Привет! Я калькулятор! Введи первое число");
//            firstNumber = scanner.nextDouble();
//            System.out.println("Ты ввел " + firstNumber + ". Введи второе число");
//            secondNumber = scanner.nextDouble();
//            System.out.println("Ты ввел " + secondNumber);
//
//            System.out.println("Выбери операцию, которую ты хочешь выполнить:");
//            System.out.println("1 - сложить\n2 - вычесть\n3 - умножить\n4 - поделить");
//            operation = scanner.nextInt();
//
//            switch (operation) {
//                case 1:
//                    System.out.println("Результат сложения двух чисел:" + (firstNumber + secondNumber));
//                    break;
//                case 2:
//                    System.out.println("Результат вычитания двух чисел:" + (firstNumber - secondNumber));
//                    break;
//                case 3:
//                    System.out.println("Результат умножения двух чисел:" + (firstNumber * secondNumber));
//                    break;
//                case 4:
//                    System.out.println("Результат деления двух чисел:" + (firstNumber / secondNumber));
//                    break;
//                default:
//                    System.out.println("Ты чет дурак, не умеешь читать,  то что написано выше.Перезапусти программу и на этапе выбора операции введи число от 1 до 4");
//                    break;
//            }
////
////            if (operation == 1) {
////                System.out.println("Результат сложения двух чисел:" + (firstNumber + secondNumber));
////            } else if (operation == 2) {
////                System.out.println("Результат вычитания двух чисел:" + (firstNumber - secondNumber));
////            } else if (operation == 3)
////                System.out.println("Результат умножения двух чисел:" + (firstNumber * secondNumber));
////            else if (operation == 4) System.out.println("Результат деления двух чисел:" + (firstNumber / secondNumber));
////            else
////                System.out.println("Ты чет дурак, не умеешь читать,  то что написано выше.Перезапусти программу и на этапе выбора операции введи число от 1 до 4");
//
//        } catch (Exception ex) {
//            System.out.println("ты ввел что-то не так");
//        }


        int i = 8;
        int proizv = 1;

        while (i <= 15) {
            proizv = proizv * i;
            i++;
        }

        /*
        сумма кубов всех целых чисел от 20 до 40
         */

        int start = 20;
        int sum = 0;

        while (start <= 40) {

            sum = sum + ((int) Math.pow(start, 3));
            start++;
        }
        System.out.println(sum);

        // дано натуральное число n, найти сумму всех чисел до n включительно

        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int st = 1;
//
//        if (n <= 0) {
//            System.out.println("ты дурак, нужно вводить больше 0");
//            return;
//        }
//
//        int sum2 = 0;
//
//        while (st <= n) {
//            sum2 += st;
//            st++;
//        }
//        System.out.println(sum2);

        //Известна масса каждого из 12 предметов. Определить общую массу всего набора предметов.

        int sum3 = 0;
        int massaEachElement;
        int countOfElements = 0;

        while (countOfElements < 12) {
            massaEachElement = scanner.nextInt();
            sum3 += massaEachElement;
            countOfElements += 1;
        }
        System.out.println(sum3);
    }
}