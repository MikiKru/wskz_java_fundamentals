package dataTypes;

// CTRL + / - auto komentarz
// CTRL + SHIFT + / - auto komentarz blokowy
public class DataTypes {
    public static void main(String[] args) {
        // zmienne
        char courseSignature = 'J';
        double coursePrice = 1999.99;
        int courseCapacity = 1000;      // deklaracja i inicjalizacja
        boolean isReady = false;
        System.out.println("Sygnatura kursu: " + courseSignature);
        System.out.println("Cena: " + coursePrice + " zł");
        courseCapacity = 1500;          // przypisanie wartości
        System.out.println("Ilość miejsc: " + courseCapacity);
        System.out.println("Czy kurs jest już uruchomiony: " + isReady);
        // stałe
        final int courseCapacityConst = 1000;
//        courseCapacityConst = 1500;
        System.out.println("Ilość miejsc - wartość stała: " + courseCapacityConst);
    }
}
