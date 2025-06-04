import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scrivi una parola");

        String parola = scan.nextLine();

        if (parola.length() >= 5){
            System.out.println("La parola ha 5 o più caratteri");
        }else {
            System.out.println("La parola ha meno di 5 caratteri");
        }
    }
}