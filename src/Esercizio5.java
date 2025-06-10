import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi qualcosa");

        String frase = scan.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

    }
}
