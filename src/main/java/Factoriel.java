import java.util.Scanner;

public class Factoriel {

    // Méthode pour calculer le factoriel
    public static long calculerFactoriel(int nombre) {
        if (nombre < 0) {
            System.out.print("Le nombre doit être positif ou nul.");
        }

        long factoriel = 1;
        for (int i = 1; i <= nombre; i++) {
            factoriel *= i;
        }
        return factoriel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif: ");
        int nombre = scanner.nextInt();

        long resultat = calculerFactoriel(nombre);
        System.out.println("Le factoriel de " + nombre + " est " + resultat);
    }
}












//public class Factoriel {
//    public ind fact(int item1)
//    {
//        for (int i = 1; i <= item1; i++) {
//            return i * item1 ;
//
//        }
//    }
//}
