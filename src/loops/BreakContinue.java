package loops;

public class BreakContinue {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,1,21,3,4,5,3};
        int searchNumber = 3;
        for (int number : numbers){
            if(number == searchNumber){
                System.out.println("znaleziono: " + searchNumber);
                break;      // przerwanie działa pętli
            } else {
                System.out.println("nie znaleziono szukanej liczby");
            }
        }
        int counter = 0;
        for (int number : numbers){
            if(number == searchNumber){
                counter ++;
                continue;   // przejście do kolejnej iteracji
            }
            System.out.println("Nie znaleziono!");
        }
        System.out.println("Krotność występowania liczby " + searchNumber + " : " + counter);
    }
}
