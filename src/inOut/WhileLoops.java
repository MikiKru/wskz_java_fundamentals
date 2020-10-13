package inOut;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sequence = "";
        String actualValue = "";
        // while -> stosujemy do zadań z nieznaną liczbą iteracji
//        while (true){
//            System.out.println("Wprowadź napis:");
//            actualValue = input.nextLine();
//            if(actualValue.toUpperCase().equals("Q")){
//                break;
//            }
//            sequence += actualValue + " ";
//        }
//        System.out.println("Wynik działania: " + sequence);
        // do-while -> stosujemy do zadań z nieznaną liczbą iteracji ale pętla
        //             wykona się przynajmniej raz
        do {
            System.out.println("Wprowadź napis:");
            actualValue = input.nextLine();
            sequence += actualValue + " ";
        } while(!actualValue.toUpperCase().equals("Q"));
        System.out.println("Wynik działania: " + sequence.substring(0,sequence.length() - 2));
    }
}
