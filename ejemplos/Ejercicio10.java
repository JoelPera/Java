// EJERCICIO 10: Control de mascotas en veterinaria
package ejemplos;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mascota[] mascotas = new Mascota[5];
        int totalMascotas = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE VETERINARIA ---");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Estadísticas de vacunación y edad");
            System.out.println("4. Salir");
            System.out.print("Selecciona opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (totalMascotas >= mascotas.length) {
                        System.out.println("No se pueden registrar más mascotas.");
                    } else {
                        System.out.print("Nombre de la mascota: ");
                        String nombre = sc.nextLine();
                        System.out.print("Especie: ");
                        String especie = sc.nextLine();
                        System.out.print("Edad en años: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("¿Vacunada? (s/n): ");
                        String vac = sc.nextLine();
                        boolean vacunada = vac.equalsIgnoreCase("s");
                        mascotas[totalMascotas++] = new Mascota(nombre, especie, edad, vacunada);
                        System.out.println("Mascota registrada.");
                    }
                    break;
                case 2:
                    mostrarMascotas(mascotas, totalMascotas);
                    break;
                case 3:
                    estadisticasMascotas(mascotas, totalMascotas);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }

    private static void mostrarMascotas(Mascota[] mascotas, int totalMascotas) {
        if (totalMascotas == 0) {
            System.out.println("No hay mascotas registradas.");
            return;
        }
        System.out.println("\nMascotas registradas:");
        for (int i = 0; i < totalMascotas; i++) {
            Mascota m = mascotas[i];
            System.out.printf("%d) %s - %s - %d años - Vacunada: %s%n",
                    i + 1, m.nombre, m.especie, m.edad, m.vacunada ? "Sí" : "No");
        }
    }

    private static void estadisticasMascotas(Mascota[] mascotas, int totalMascotas) {
        if (totalMascotas == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        int sumaEdades = 0;
        int vacunadas = 0;
        int perros = 0;
        int gatos = 0;
        int otros = 0;

        for (int i = 0; i < totalMascotas; i++) {
            Mascota m = mascotas[i];
            sumaEdades += m.edad;
            if (m.vacunada) {
                vacunadas++;
            }
            if (m.especie.equalsIgnoreCase("Perro")) {
                perros++;
            } else if (m.especie.equalsIgnoreCase("Gato")) {
                gatos++;
            } else {
                otros++;
            }
        }

        double promedioEdad = (double) sumaEdades / totalMascotas;
        System.out.printf("Edad promedio: %.2f años%n", promedioEdad);
        System.out.printf("Mascotas vacunadas: %d de %d%n", vacunadas, totalMascotas);
        System.out.printf("Tipo de mascotas -> Perros: %d, Gatos: %d, Otros: %d%n", perros, gatos, otros);
    }
}

class Mascota {
    String nombre;
    String especie;
    int edad;
    boolean vacunada;

    public Mascota(String nombre, String especie, int edad, boolean vacunada) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunada = vacunada;
    }
}