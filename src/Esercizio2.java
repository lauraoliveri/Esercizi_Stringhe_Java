import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi una parola");

        String parola = scan.nextLine();

        if (parola.charAt(0) == parola.charAt(parola.length() -1)){
            System.out.println("Il primo e l'ultimo carattere sono uguali");
        }else {
            System.out.println("Il primo e l'ultimo carattere NON sono uguali");
        }
    }
}