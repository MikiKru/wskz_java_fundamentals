package operations;

public class Operations {
    public static void main(String[] args) {
        int a = 11;
        double b = 15.33;
        System.out.println("Dodawanie liczb: " + (a + b));
        int result = (int)(a + b);  // konwersja zawężająca
        System.out.println("Wynik: " + result);
        double result2 = (double)(a * 5);     // konwersja rozszerzająca
        System.out.println("Wynik: " + result2);
        System.out.println("Modulo: " + (15 % 4));
        System.out.println("Czy liczba jest parzysta: " + ((a % 2) == 0));
        b += 5;
        System.out.println(b);
        int i = 0;
        System.out.println("Inkrementacja " + (i--));
        System.out.println("Wartość i: " + i);

        System.out.println("Porówanie: " + (a >= 6));

        boolean log1 = true;
        boolean log2 = false;

        System.out.println(log1 == log2);
        System.out.println(log1 != log2);
        System.out.println(log1 == !log2);
        System.out.println(log1 || log2);
        System.out.println(log1 && log2);


    }
}
