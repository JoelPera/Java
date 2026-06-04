// EJERCICIO 8: Lista de vehículos de alquiler
package ejemplos;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo[] flota = new Vehiculo[5];
        int totalVehiculos = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE VEHÍCULOS ---");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar flota");
            System.out.println("3. Estadísticas de kilometraje");
            System.out.println("4. Salir");
            System.out.print("Selecciona opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (totalVehiculos >= flota.length) {
                        System.out.println("No se pueden registrar más vehículos.");
                    } else {
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Matrícula: ");
                        String matricula = sc.nextLine();
                        System.out.print("Kilometraje actual: ");
                        int kilometraje = sc.nextInt();
                        sc.nextLine();
                        System.out.print("¿Está alquilado? (s/n): ");
                        String alquilado = sc.nextLine();
                        boolean renta = alquilado.equalsIgnoreCase("s");
                        flota[totalVehiculos++] = new Vehiculo(modelo, matricula, kilometraje, renta);
                        System.out.println("Vehículo registrado.");
                    }
                    break;
                case 2:
                    mostrarFlota(flota, totalVehiculos);
                    break;
                case 3:
                    estadisticasVehiculos(flota, totalVehiculos);
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

    private static void mostrarFlota(Vehiculo[] flota, int totalVehiculos) {
        if (totalVehiculos == 0) {
            System.out.println("No hay vehículos registrados.");
            return;
        }
        System.out.println("\nVehículos de la flota:");
        for (int i = 0; i < totalVehiculos; i++) {
            Vehiculo v = flota[i];
            System.out.printf("%d) %s - %s - %d km - Alquilado: %s%n",
                    i + 1, v.modelo, v.matricula, v.kilometraje, v.alquilado ? "Sí" : "No");
        }
    }

    private static void estadisticasVehiculos(Vehiculo[] flota, int totalVehiculos) {
        if (totalVehiculos == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        int sumaKilometraje = 0;
        int alquilados = 0;
        int disponible = 0;

        for (int i = 0; i < totalVehiculos; i++) {
            Vehiculo v = flota[i];
            sumaKilometraje += v.kilometraje;
            if (v.alquilado) {
                alquilados++;
            } else {
                disponible++;
            }
        }

        double promedioKilometraje = (double) sumaKilometraje / totalVehiculos;
        System.out.printf("Kilometraje promedio: %.2f km%n", promedioKilometraje);
        System.out.printf("Vehículos alquilados: %d, disponibles: %d%n", alquilados, disponible);
    }
}

class Vehiculo {
    String modelo;
    String matricula;
    int kilometraje;
    boolean alquilado;

    public Vehiculo(String modelo, String matricula, int kilometraje, boolean alquilado) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.kilometraje = kilometraje;
        this.alquilado = alquilado;
    }
}