package arrays;

public class OneDimArrays {
    public static void main(String[] args) {
        // deklaracja tablicy 1D
        String [] names = new String [5];
        // przypisanie wartości
        names[0] = "Ala";
        names[3] = "Ola";
        // odwołanie do elementów tablicy
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
//        System.out.println(names[5]); - wyjątek ArrayIndexOutOfBoundsException
        System.out.println("Długość tablicy: " + names.length);
    }
}
