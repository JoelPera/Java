// EJERCICIO 4: Reservas de gimnasio
package ejemplos;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reserva[] reservas = new Reserva[5];
        int totalReservas = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE RESERVAS ---");
            System.out.println("1. Registrar reserva");
            System.out.println("2. Mostrar reservas");
            System.out.println("3. Estadísticas de clases");
            System.out.println("4. Salir");
            System.out.print("Selecciona: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (totalReservas >= reservas.length) {
                        System.out.println("No se pueden registrar más reservas.");
                    } else {
                        System.out.print("Nombre del cliente: ");
                        String cliente = sc.nextLine();
                        System.out.print("Tipo de clase (Yoga/Cardio/Funcional): ");
                        String clase = sc.nextLine();
                        System.out.print("Número de asistentes: ");
                        int asistentes = sc.nextInt();
                        sc.nextLine();
                        System.out.print("¿Confirma la reserva? (s/n): ");
                        String confirma = sc.nextLine();
                        boolean confirmada = confirma.equalsIgnoreCase("s");
                        reservas[totalReservas++] = new Reserva(cliente, clase, asistentes, confirmada);
                        System.out.println("Reserva registrada.");
                    }
                    break;
                case 2:
                    mostrarReservas(reservas, totalReservas);
                    break;
                case 3:
                    estadisticasReservas(reservas, totalReservas);
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

    private static void mostrarReservas(Reserva[] reservas, int totalReservas) {
        if (totalReservas == 0) {
            System.out.println("No hay reservas registradas.");
            return;
        }
        System.out.println("\nReservas registradas:");
        for (int i = 0; i < totalReservas; i++) {
            Reserva r = reservas[i];
            System.out.printf("%d) Cliente: %s - Clase: %s - Asistentes: %d - Confirmada: %s%n",
                    i + 1, r.cliente, r.clase, r.asistentes, r.confirmada ? "Sí" : "No");
        }
    }

    private static void estadisticasReservas(Reserva[] reservas, int totalReservas) {
        if (totalReservas == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        int totalAsistentes = 0;
        int confirmadas = 0;
        int yoga = 0;
        int cardio = 0;
        int funcional = 0;

        for (int i = 0; i < totalReservas; i++) {
            Reserva r = reservas[i];
            totalAsistentes += r.asistentes;
            if (r.confirmada) {
                confirmadas++;
            }
            if (r.clase.equalsIgnoreCase("Yoga")) {
                yoga++;
            } else if (r.clase.equalsIgnoreCase("Cardio")) {
                cardio++;
            } else if (r.clase.equalsIgnoreCase("Funcional")) {
                funcional++;
            }
        }

        double promedioAsistentes = (double) totalAsistentes / totalReservas;
        System.out.printf("Promedio de asistentes por reserva: %.2f%n", promedioAsistentes);
        System.out.printf("Reservas confirmadas: %d de %d%n", confirmadas, totalReservas);
        System.out.printf("Distribución de clases -> Yoga: %d, Cardio: %d, Funcional: %d%n",
                yoga, cardio, funcional);
    }
}

class Reserva {
    String cliente;
    String clase;
    int asistentes;
    boolean confirmada;

    public Reserva(String cliente, String clase, int asistentes, boolean confirmada) {
        this.cliente = cliente;
        this.clase = clase;
        this.asistentes = asistentes;
        this.confirmada = confirmada;
    }
}