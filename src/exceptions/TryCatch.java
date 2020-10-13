package exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int integerNumber;
        double doubleNumber;
        String name;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        while (true) {
            try {
                System.out.println("Wprowadź liczbę całkowitą różna od 13");
                integerNumber = input.nextInt();
                if(integerNumber == 13){
                    throw new ArithmeticException();    // wygeneruj wyjątek
                }
                System.out.println("Wprowadź liczbę zmiennoprzecinkową");
                doubleNumber = input.nextDouble();
                System.out.println("Wprowadź imię");
                input.nextLine();   // konsumpcja znaku \n -> przejścia do nowej lini
                name = input.nextLine();
                System.out.println("Wprowadzone liczby: " + integerNumber + " " + doubleNumber);
                System.out.println("Wprowadzone imię: " + name);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd formatu danych");
                e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("Podałeś liczbę 13 - niedozwolone");
            } catch (Exception e){
                System.out.println("Wyłapuje każdy inny wyjątek");
            } finally {
                input.nextLine();   // konsumpcja znaku \n -> przejścia do nowej lini
            }
        }
        System.out.println("Jestem za TRY-CATCH");
    }
}
