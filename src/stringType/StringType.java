package stringType;

public class StringType {
    public static void main(String[] args) {
        String title = "Podstawy progmowania w jązyku Java.";
        String subtitle = "Java podstawy.";
        System.out.println("Tytuł kursu: " + title);
        System.out.println("Długość ciągu znaków: " + title.length());
        System.out.println("Pierwszy znak: " + title.charAt(0));
        System.out.println("Ostatni znak: " + title.charAt(title.length() - 1));
        System.out.println("Czy wartości są równe: " + title.equals(subtitle));
        System.out.println("Czy wartości są równe: " + title.equals(title.toLowerCase()));

    }
}
