import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi qualcosa");

        String parola = scan.nextLine();

        for (int i = 0; i < parola.length() / 2; i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
                System.out.println("La parola non è un palindromo");
                return;
            }
        }

        System.out.println("La parola è un palindromo");
    }
}
