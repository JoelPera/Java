// EJERCICIO 9: Registro de ventas de productos
package ejemplos;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venta[] ventas = new Venta[5];
        int totalVentas = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE VENTAS ---");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Estadísticas de ventas");
            System.out.println("4. Salir");
            System.out.print("Selecciona: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (totalVentas >= ventas.length) {
                        System.out.println("No se pueden registrar más ventas.");
                    } else {
                        System.out.print("Producto vendido: ");
                        String producto = sc.nextLine();
                        System.out.print("Cantidad vendida: ");
                        int cantidad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Precio unitario: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Vendedor: ");
                        String vendedor = sc.nextLine();
                        ventas[totalVentas++] = new Venta(producto, cantidad, precio, vendedor);
                        System.out.println("Venta registrada.");
                    }
                    break;
                case 2:
                    mostrarVentas(ventas, totalVentas);
                    break;
                case 3:
                    estadisticasVentas(ventas, totalVentas);
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

    private static void mostrarVentas(Venta[] ventas, int totalVentas) {
        if (totalVentas == 0) {
            System.out.println("No hay ventas registradas.");
            return;
        }
        System.out.println("\nVentas registradas:");
        for (int i = 0; i < totalVentas; i++) {
            Venta v = ventas[i];
            System.out.printf("%d) %s - Cantidad: %d - Precio unitario: $%.2f - Total: $%.2f - Vendedor: %s%n",
                    i + 1, v.producto, v.cantidad, v.precioUnitario, v.calcularTotal(), v.vendedor);
        }
    }

    private static void estadisticasVentas(Venta[] ventas, int totalVentas) {
        if (totalVentas == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }

        double totalFacturado = 0.0;
        double mayorVenta = ventas[0].calcularTotal();
        int indiceMayor = 0;

        for (int i = 0; i < totalVentas; i++) {
            double totalVenta = ventas[i].calcularTotal();
            totalFacturado += totalVenta;
            if (totalVenta > mayorVenta) {
                mayorVenta = totalVenta;
                indiceMayor = i;
            }
        }

        double promedioVenta = totalFacturado / totalVentas;
        System.out.printf("Total facturado: $%.2f%n", totalFacturado);
        System.out.printf("Venta promedio: $%.2f%n", promedioVenta);
        System.out.printf("Mayor venta: %s por $%.2f%n", ventas[indiceMayor].producto, mayorVenta);
    }
}

class Venta {
    String producto;
    int cantidad;
    double precioUnitario;
    String vendedor;

    public Venta(String producto, int cantidad, double precioUnitario, String vendedor) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.vendedor = vendedor;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }
}