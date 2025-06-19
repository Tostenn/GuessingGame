import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue au jeu de devinettes !");
        System.out.println("Devinez un nombre entre 1 et 100. Vous avez 10 tentatives.");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Essai #" + (attempts + 1) + " : ");
            int userGuess;
            try {
                userGuess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                continue;
            }

            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Bravo ! Vous avez deviné le bon nombre en " + attempts + " tentative(s).");
                return;
            } else if (userGuess < numberToGuess) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }
        }

        System.out.println("Vous avez utilisé toutes vos tentatives. Le nombre à deviner était : " + numberToGuess);
    }
}
