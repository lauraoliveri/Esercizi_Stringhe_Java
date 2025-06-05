import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi qualcosa");

        String frase = scan.nextLine();
        String frase_in_minuscolo = frase.toLowerCase();
        System.out.println(frase_in_minuscolo.contains("java"));
    }
}