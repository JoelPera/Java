// EJERCICIO 2: Registro de pacientes de hospital
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente[] lista = new Paciente[5]; // Array para pacientes
        int count = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE PACIENTES ---");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Listar pacientes");
            System.out.println("3. Estadísticas de edad y condición");
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (count >= lista.length) {
                        System.out.println("No se pueden registrar más pacientes.");
                    } else {
                        System.out.print("Nombre del paciente: ");
                        String nombre = sc.nextLine();
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Diagnóstico: ");
                        String diagnostico = sc.nextLine();
                        System.out.print("¿Es crónico? (s/n): ");
                        String cr = sc.nextLine();
                        boolean cronico = cr.equalsIgnoreCase("s");
                        lista[count++] = new Paciente(nombre, edad, diagnostico, cronico);
                        System.out.println("Paciente registrado.");
                    }
                    break;
                case 2:
                    listarPacientes(lista, count);
                    break;
                case 3:
                    estadisticasPacientes(lista, count);
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

    private static void listarPacientes(Paciente[] lista, int count) {
        System.out.println("\nPacientes registrados:");
        if (count == 0) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        for (int i = 0; i < count; i++) {
            Paciente p = lista[i];
            System.out.printf("%d) %s - %d años - %s - Crónico: %s%n", i + 1, p.nombre, p.edad, p.diagnostico,
                    p.cronico ? "Sí" : "No");
        }
    }

    private static void estadisticasPacientes(Paciente[] lista, int count) {
        if (count == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        int sumaEdades = 0;
        int edadMin = lista[0].edad;
        int edadMax = lista[0].edad;
        int cronicos = 0;

        for (int i = 0; i < count; i++) {
            Paciente p = lista[i];
            sumaEdades += p.edad;
            if (p.edad < edadMin) {
                edadMin = p.edad;
            }
            if (p.edad > edadMax) {
                edadMax = p.edad;
            }
            if (p.cronico) {
                cronicos++;
            }
        }

        double promedioEdad = (double) sumaEdades / count;
        System.out.printf("Edad promedio: %.2f%n", promedioEdad);
        System.out.printf("Edad mínima: %d, edad máxima: %d%n", edadMin, edadMax);
        System.out.printf("Pacientes crónicos: %d de %d%n", cronicos, count);
    }
}

class Paciente {
    String nombre;
    int edad;
    String diagnostico;
    boolean cronico;

    public Paciente(String nombre, int edad, String diagnostico, boolean cronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
        this.cronico = cronico;
    }
}