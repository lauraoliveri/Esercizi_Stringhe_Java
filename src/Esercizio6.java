import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi qualcosa");

        String frase = scan.nextLine();
        System.out.println(frase.replace('a', '@'));

    }
}
