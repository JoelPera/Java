import java.util.Scanner;

public class E2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Mida del rombe: ");
        int mida = sc.nextInt();
        char matriu []= new char [mida]; 
        for (int i = 0; i < matriu.length; i++) {
            matriu [i] = '*';
            for (int j = 0; j < matriu.length; j++) {
            System.out.print(matriu [j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matriu.length - 1; i++) {
            matriu [i]= ' ';
            for (int j = 0; j < matriu.length; j++) {
                System.out.print(matriu[j]);
            }
            System.out.println();
        }
    }
}
