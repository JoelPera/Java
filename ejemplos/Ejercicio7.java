// EJERCICIO 7: Agenda de eventos y asistentes
package ejemplos;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Evento[] eventos = new Evento[5];
        int cantidadEventos = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE EVENTOS ---");
            System.out.println("1. Registrar evento");
            System.out.println("2. Mostrar eventos");
            System.out.println("3. Estadísticas de asistencia");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cantidadEventos >= eventos.length) {
                        System.out.println("No hay espacio para más eventos.");
                    } else {
                        System.out.print("Nombre del evento: ");
                        String nombre = sc.nextLine();
                        System.out.print("Lugar: ");
                        String lugar = sc.nextLine();
                        System.out.print("Capacidad máxima: ");
                        int capacidad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Asistentes confirmados: ");
                        int asistentes = sc.nextInt();
                        sc.nextLine();
                        eventos[cantidadEventos++] = new Evento(nombre, lugar, capacidad, asistentes);
                        System.out.println("Evento registrado.");
                    }
                    break;
                case 2:
                    mostrarEventos(eventos, cantidadEventos);
                    break;
                case 3:
                    estadisticasEventos(eventos, cantidadEventos);
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

    private static void mostrarEventos(Evento[] eventos, int cantidadEventos) {
        if (cantidadEventos == 0) {
            System.out.println("No hay eventos registrados.");
            return;
        }
        System.out.println("\nEventos registrados:");
        for (int i = 0; i < cantidadEventos; i++) {
            Evento e = eventos[i];
            System.out.printf("%d) %s - %s - Capacidad: %d - Asistentes: %d%n",
                    i + 1, e.nombre, e.lugar, e.capacidad, e.asistentes);
        }
    }

    private static void estadisticasEventos(Evento[] eventos, int cantidadEventos) {
        if (cantidadEventos == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        int totalAsistentes = 0;
        int totalCapacidad = 0;
        int mejorEventoIndex = 0;

        for (int i = 0; i < cantidadEventos; i++) {
            Evento e = eventos[i];
            totalAsistentes += e.asistentes;
            totalCapacidad += e.capacidad;
            if (e.asistentes > eventos[mejorEventoIndex].asistentes) {
                mejorEventoIndex = i;
            }
        }

        double promedioAsistencia = (double) totalAsistentes / cantidadEventos;
        double promedioOcupacion = totalCapacidad == 0 ? 0.0 : (double) totalAsistentes / totalCapacidad * 100;
        System.out.printf("Asistentes promedio por evento: %.2f%n", promedioAsistencia);
        System.out.printf("Ocupación promedio: %.2f%%%n", promedioOcupacion);
        System.out.printf("Evento con mayor asistencia: %s (%d asistentes)%n",
                eventos[mejorEventoIndex].nombre, eventos[mejorEventoIndex].asistentes);
    }
}

class Evento {
    String nombre;
    String lugar;
    int capacidad;
    int asistentes;

    public Evento(String nombre, String lugar, int capacidad, int asistentes) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.asistentes = asistentes;
    }
}