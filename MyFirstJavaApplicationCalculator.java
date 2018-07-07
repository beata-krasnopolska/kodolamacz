package pl.kodolamacz;
import java.util.Scanner;
public class MyFirstJavaApplicationCalculator {
        public static void main (String[]args) {

            Scanner scanner = new Scanner(System.in);
            String answer = "t";
            do {
                System.out.println("Proszę podaj w oddzielnych linijkach jakąś liczbę, operację matematyczną +,-,*,/,%, a następnie kolejną liczbę:");
                double x = scanner.nextDouble();
                String sign = scanner.next();
                double y = scanner.nextDouble();
                double result = 0;
                if (sign.equals("*")) {
                    result = x * y;
                } else if (sign.equals("/")) {
                    result = x / y;
                } else if (sign.equals("+")) {
                    result = x + y;
                } else if (sign.equals("-")) {
                    result = x - y;
                } else if (sign.equals("%")) {
                    result = x % y;
                } else {
                    System.out.println("Wrong sign!");
                }
                System.out.println("Twój wynik to:" + result);
                System.out.println("Chcesz wykonać kolejne działanie? Wpisz literę t lub n.");
                answer = scanner.next();
            } while (answer.equals("t"));

            if (answer.equals("t")) {
                answer = "t";
            } else if (answer.equals("n")) {
                System.out.println("Do zobaczenia później!");
            } else {
                System.out.println("Nieprawidłowy znak, miałeś wpisać t lub n");
            }
            scanner.close();
            }


        }



