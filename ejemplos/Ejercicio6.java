// EJERCICIO 6: Control de empleados y horas trabajadas
package ejemplos;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];
        int totalEmpleados = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE EMPLEADOS ---");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Mostrar nómina");
            System.out.println("3. Estadísticas de horas");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (totalEmpleados >= empleados.length) {
                        System.out.println("Ya no se pueden registrar empleados.");
                    } else {
                        System.out.print("Nombre del empleado: ");
                        String nombre = sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.print("Horas trabajadas: ");
                        int horas = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Pago por hora: ");
                        double tarifa = sc.nextDouble();
                        sc.nextLine();
                        empleados[totalEmpleados++] = new Empleado(nombre, cargo, horas, tarifa);
                        System.out.println("Empleado registrado.");
                    }
                    break;
                case 2:
                    mostrarNomina(empleados, totalEmpleados);
                    break;
                case 3:
                    estadisticasHoras(empleados, totalEmpleados);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }

    private static void mostrarNomina(Empleado[] empleados, int totalEmpleados) {
        if (totalEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("\nNómina de empleados:");
        for (int i = 0; i < totalEmpleados; i++) {
            Empleado e = empleados[i];
            System.out.printf("%d) %s - %s - Horas: %d - Salario: $%.2f%n", i + 1, e.nombre, e.cargo, e.horas, e.calcularSalario());
        }
    }

    private static void estadisticasHoras(Empleado[] empleados, int totalEmpleados) {
        if (totalEmpleados == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        int horasTotales = 0;
        int horasMin = empleados[0].horas;
        int horasMax = empleados[0].horas;

        for (int i = 0; i < totalEmpleados; i++) {
            int horas = empleados[i].horas;
            horasTotales += horas;
            if (horas < horasMin) {
                horasMin = horas;
            }
            if (horas > horasMax) {
                horasMax = horas;
            }
        }

        double promedioHoras = (double) horasTotales / totalEmpleados;
        System.out.printf("Horas totales trabajadas: %d%n", horasTotales);
        System.out.printf("Horas promedio por empleado: %.2f%n", promedioHoras);
        System.out.printf("Menos horas: %d, más horas: %d%n", horasMin, horasMax);
    }
}

class Empleado {
    String nombre;
    String cargo;
    int horas;
    double tarifa;

    public Empleado(String nombre, String cargo, int horas, double tarifa) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public double calcularSalario() {
        return horas * tarifa; // Salario calculado multiplicando horas por tarifa
    }
}