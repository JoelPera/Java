import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Utils {
    public static Scanner sc = new Scanner(System.in);
    public static RandomGenerator rg = RandomGenerator.getDefault();

    public static int nextInt(String ms) {
        System.out.print(ms);
        while (!sc.hasNextInt()) {
            System.out.println("Error, el numero ha de ser enter.");
            System.out.print(ms);
            sc.nextLine();
        }
        return Integer.parseInt(sc.nextLine());
    }

    // INT

    // STRING
    public static String nextString(String ms) {
        System.out.print(ms);
        return sc.nextLine();
    }

    // STRING

    // DOUBLE
    public static double nextDouble(String ms) {
        System.out.print(ms);
        while (!sc.hasNextDouble()) {
            System.out.println("Error, el numero ha de ser double/float.");
            System.out.print(ms);
            sc.nextLine();
        }
        return Double.parseDouble(sc.nextLine());
    }

    // CHAR
    public static char nextChar(String ms) {
        System.out.print(ms);
        String input = sc.next();
        while (input.length() != 1) {
            System.out.println("Error, introdueix només un caràcter.");
            System.out.print(ms);
            input = sc.next();
        }

        return input.toLowerCase().charAt(0);
    }
    // CHAR

    public static int nextRand(int a, int b) {
        return rg.nextInt(a, b + 1);
    }
}
