import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi qualcosa");

        String frase = scan.nextLine();

        if( frase.charAt(0) == 'c' && frase.charAt(frase.length() - 1) == 'r') {
            System.out.println("La frase inizia con c e finisce con r.");
        }


    }
}
