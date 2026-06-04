package Ejercicios;

public class Ejercicio1{
    public static int[] llegeixArray(int allargada) {
        int array[] = new int[allargada];
        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.nextInt("");
        }
        return array;
    }

    public static boolean esCapiCua(int arrayCapiCua[]) {
        boolean capicua = true;
        double x = arrayCapiCua.length / 2;
        for (int i = 0; i < arrayCapiCua.length / 2; i++) {
            int primer = arrayCapiCua[i];
            int ultim = arrayCapiCua[arrayCapiCua.length - i - 1];
            if (primer != ultim) {
                capicua = false;
            }
        }
        return capicua;
    }

    public static void main(String[] args) {
        int allargada = Utils.nextInt("Mida de l'array: ");
        int arrayCapiCua[] = llegeixArray(allargada);
        System.out.print("L'array [");
        for (int i = 0; i < arrayCapiCua.length; i++) {
            System.out.printf("%d", arrayCapiCua[i]);
            if (i != arrayCapiCua.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] ");
        if (!esCapiCua(arrayCapiCua)) {
            System.out.print(" no ");
        }
        System.out.print("és cap-i-cua.\n");
        if (esCapiCua(arrayCapiCua)) {
            System.out.print(".");// Se que aquest print semblara una tonteria pero sempre dius que ha de ser
            // igual i quant es cap i cua te el punt final pero quan no ho es no el te
        }
    }
}
