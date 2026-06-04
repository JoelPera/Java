package ejemplos;
// EJERCICIO 1: Gestión de inventario de tienda
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer datos por teclado
        Producto[] inventario = new Producto[5]; // Array para almacenar hasta 5 productos
        int cantidadProductos = 0; // Conteo real de productos registrados

        boolean salir = false; // Controla el bucle principal del menú
        while (!salir) {
            System.out.println("\n--- MENÚ DE INVENTARIO ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Calcular valor total e inventario");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el salto de línea antes de leer texto

            switch (opcion) {
                case 1:
                    if (cantidadProductos >= inventario.length) {
                        System.out.println("No se pueden registrar más productos.");
                    } else {
                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();
                        System.out.print("Precio unitario: ");
                        double precio = sc.nextDouble();
                        System.out.print("Cantidad en stock: ");
                        int stock = sc.nextInt();
                        sc.nextLine(); // Limpiar buffer después de nextInt()
                        inventario[cantidadProductos] = new Producto(nombre, precio, stock);
                        cantidadProductos++;
                        System.out.println("Producto registrado correctamente.");
                    }
                    break;
                case 2:
                    mostrarInventario(inventario, cantidadProductos);
                    break;
                case 3:
                    calcularEstadisticasInventario(inventario, cantidadProductos);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta otra vez.");
            }
        }
        sc.close(); // Cerrar Scanner al final
    }

    private static void mostrarInventario(Producto[] inventario, int cantidad) {
        System.out.println("\nInventario actual:");
        for (int i = 0; i < cantidad; i++) {
            Producto p = inventario[i];
            System.out.printf("%d) %s - $%.2f - Stock: %d%n", i + 1, p.nombre, p.precio, p.stock);
        }
        if (cantidad == 0) {
            System.out.println("No hay productos registrados.");
        }
    }

    private static void calcularEstadisticasInventario(Producto[] inventario, int cantidad) {
        if (cantidad == 0) {
            System.out.println("No hay datos para calcular estadísticas.");
            return;
        }

        double valorTotal = 0.0; // Suma del valor de todos los productos
        int totalUnidades = 0; // Suma de todas las unidades disponibles
        double precioMinimo = inventario[0].precio; // Inicializar con el primer precio
        double precioMaximo = inventario[0].precio; // Inicializar con el primer precio

        for (int i = 0; i < cantidad; i++) {
            Producto p = inventario[i];
            double valorProducto = p.precio * p.stock;
            valorTotal += valorProducto;
            totalUnidades += p.stock;

            if (p.precio < precioMinimo) {
                precioMinimo = p.precio;
            }
            if (p.precio > precioMaximo) {
                precioMaximo = p.precio;
            }
        }

        double precioPromedio = valorTotal / totalUnidades;
        System.out.printf("Valor total del inventario: $%.2f%n", valorTotal);
        System.out.printf("Unidades totales en stock: %d%n", totalUnidades);
        System.out.printf("Precio promedio por unidad: $%.2f%n", precioPromedio);
        System.out.printf("Producto más barato: $%.2f, más caro: $%.2f%n", precioMinimo, precioMaximo);
    }
}

class Producto {
    String nombre; // Nombre del producto
    double precio; // Precio unitario
    int stock;     // Cantidad disponible en inventario

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}