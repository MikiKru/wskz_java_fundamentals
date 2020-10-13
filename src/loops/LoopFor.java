package loops;

public class LoopFor {
    public static void main(String[] args) {
        String[] names = {"Ala", "Ola", "Jan", "Adam"};
        // for - stosowana do znanej liczby iteracji
        for (int i = 0; i < names.length; i++){
            names[i] = names[i].toUpperCase();
//            System.out.println(names[i]);
        }
        // foreach - stosowana do znanej liczby iteracji - tylko do odczytu
        for (String name : names) {
            System.out.println(name);
        }
    }
}
