package conditionalInstructions;

public class SwitchCase {
    public static void main(String[] args) {
        int key = 3;
        switch (key){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            default:
                System.out.println("Brak inforamacji");
        }
    }
}
