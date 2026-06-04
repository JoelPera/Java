package Ejercicios;

import java.util.Random;

public class Ejercicio1copy {
    public static void main(String[] args) {
        // Crear matriz 5x5
        int[][] tabla = new int[5][5];
        Random rand = new Random();
        
        // 1. Llenar con números aleatorios (1-100)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = rand.nextInt(100) + 1;
            }
        }
        
        // 2. Mostrar la matriz
        System.out.println("TABLERO:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
        
        // 3. Calcular suma total
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                suma += tabla[i][j];
            }
        }
        System.out.println("\nSuma total: " + suma);
        
        // 4. Encontrar máximo y posición
        int maximo = tabla[0][0];
        int fila = 0, columna = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tabla[i][j] > maximo) {
                    maximo = tabla[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        
        System.out.println("Máximo: " + maximo);
        System.out.println("Posición: [" + fila + "][" + columna + "]");
    }
}