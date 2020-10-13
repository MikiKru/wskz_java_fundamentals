package inOut;

import java.util.Scanner;

// ALT + Enter ->  auto-podpowiedź
public class InOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź imię:");
        String name = input.nextLine();
        System.out.println("Wprowadź nazwisko:");
        String lastName = input.nextLine();
        input.close();  // od tej pory nie możemy wprowadzać danych do programu z klawiatury

        System.out.println("Wprowadzono imię: " + name.toUpperCase());
        System.out.println("Wprowadzono nazwisko: " + lastName.toUpperCase());
    }
}
