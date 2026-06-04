import java.util.Scanner;

public class Ejercicio1a {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cont = 0;
        while (x != 0 || y != 0) {
            if ((x + y) % 2 == 0 ) {
                cont += 1;
            }
        x = sc.nextInt();
        y = sc.nextInt();        }
        System.out.printf("Nombre de parells-parells: %d\n", cont);
    }
}
