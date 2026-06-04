import java.util.Scanner;

public class E3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Quants jocs vols introduir? ");
        int jocs = Integer.parseInt(sc.nextLine());
        int puntuacions [] = new int [jocs];
        String noms_jocs [] = new String [jocs];
        for (int i = 0; i < jocs; i++) {
            System.out.printf("\nNom del joc #%d: ", i + 1);
            noms_jocs [i] = sc.nextLine();
            System.out.printf("\nPuntuació del joc #%d: ", i + 1);
            puntuacions [i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println();
        int puntuacio_max = 0;
        for (int i = 0; i < puntuacions.length; i++) {
            if (puntuacio_max < puntuacions [i]) {
                puntuacio_max = puntuacions [i];
            }
        }
        System.out.println("Preselecció- ");
        for (int i = 0; i < puntuacions.length; i++) {
            if (puntuacio_max == puntuacions [i]) {
                System.out.printf("- %s\n", noms_jocs[i]);
            }
        }
    }
}
