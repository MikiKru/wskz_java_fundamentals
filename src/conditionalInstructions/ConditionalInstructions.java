package conditionalInstructions;

public class ConditionalInstructions {
    public static void main(String[] args) {
        int a = -12;

        if(a == 0) {
            // gdy warunek jest prawdziwy
            System.out.println(a + " jest zerem");
        } else if (a % 2 == 0){
            System.out.println(a + " jest liczbą parzystą");
            if(a > 0){
                System.out.println(a + " jest liczbą parzystą dodatnią");
            } else {
                System.out.println(a + " jest liczbą parzystą ujemną");
            }
        } else {
            // gdy warunek jest fałszywy
            System.out.println(a + " jest liczbą nieparzystą");
        }
    }
}
