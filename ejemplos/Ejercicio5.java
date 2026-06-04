// EJERCICIO 5: Gestión de calificaciones de curso
package ejemplos;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante[] curso = new Estudiante[5];
        int cantidad = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE CALIFICACIONES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Estadísticas de notas");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cantidad >= curso.length) {
                        System.out.println("No se pueden agregar más estudiantes.");
                    } else {
                        System.out.print("Nombre del estudiante: ");
                        String nombre = sc.nextLine();
                        System.out.print("Nota final: ");
                        double nota = sc.nextDouble();
                        sc.nextLine();
                        curso[cantidad++] = new Estudiante(nombre, nota);
                        System.out.println("Estudiante registrado.");
                    }
                    break;
                case 2:
                    mostrarEstudiantes(curso, cantidad);
                    break;
                case 3:
                    estadisticasNotas(curso, cantidad);
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

    private static void mostrarEstudiantes(Estudiante[] curso, int cantidad) {
        if (cantidad == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("\nEstudiantes y notas:");
        for (int i = 0; i < cantidad; i++) {
            Estudiante e = curso[i];
            System.out.printf("%d) %s - %.2f - %s%n", i + 1, e.nombre, e.nota,
                    e.nota >= 5.0 ? "Aprobado" : "Reprobado");
        }
    }

    private static void estadisticasNotas(Estudiante[] curso, int cantidad) {
        if (cantidad == 0) {
            System.out.println("No hay datos para generar estadísticas.");
            return;
        }

        double suma = 0.0;
        double notaMin = curso[0].nota;
        double notaMax = curso[0].nota;
        int aprobados = 0;

        for (int i = 0; i < cantidad; i++) {
            double nota = curso[i].nota;
            suma += nota;
            if (nota < notaMin) {
                notaMin = nota;
            }
            if (nota > notaMax) {
                notaMax = nota;
            }
            if (nota >= 5.0) {
                aprobados++;
            }
        }

        double promedio = suma / cantidad;
        System.out.printf("Nota promedio: %.2f%n", promedio);
        System.out.printf("Nota mínima: %.2f, nota máxima: %.2f%n", notaMin, notaMax);
        System.out.printf("Cantidad aprobados: %d de %d%n", aprobados, cantidad);
    }
}

class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}