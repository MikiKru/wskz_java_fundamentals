package arrays;

public class TwoDimArrays {
    public static void main(String[] args) {
        // deklaracje i przypisanie wartości
        int [][] numbers =
                {
                        {0,0,0},
                        {0,0,0},
                        {0,0,0}
                };
        // odwołanie do elementów tablicy 2D
        numbers[1][1] = 1;
        numbers[2][1] = 2;

        System.out.println(numbers[0][0] + " " + numbers[0][1] + " " + numbers[0][2]);
        System.out.println(numbers[1][0] + " " + numbers[1][1] + " " + numbers[1][2]);
        System.out.println(numbers[2][0] + " " + numbers[2][1] + " " + numbers[2][2]);
    }
}
