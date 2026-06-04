package ejemplos.POO;


import java.util.Scanner;

/*
Inventario de Componentes:
- Entidad: Componente (nombre, fabricante, stock, precio)
- Media: precio medio por componente
- Extremo: componente con menor stock
- Comentarios: explicación de estructuras y Scanner
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Componente[] items = new Componente[5];
        int n = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- TIENDA PC ---");
            System.out.println("1. Registrar componente");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Precio medio (mitjana)");
            System.out.println("4. Componente con menor stock (pitjor)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = safeNextInt(sc);

            switch (op) {
                case 1:
                    if (n >= items.length) { System.out.println("Inventario lleno."); }
                    else {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Fabricante: ");
                        String fab = sc.nextLine();
                        System.out.print("Stock (entero): ");
                        int stock = safeNextInt(sc);
                        System.out.print("Precio (double): ");
                        double precio = safeNextDouble(sc);
                        items[n++] = new Componente(nombre, fab, stock, precio);
                        System.out.println("Componente añadido.");
                    }
                    break;
                case 2:
                    mostrar(items, n);
                    break;
                case 3:
                    System.out.printf("Precio medio: %.2f%n", precioMedio(items, n));
                    break;
                case 4:
                    Componente peor = menorStock(items, n);
                    if (peor != null) System.out.printf("Menor stock: %s (%d unidades)%n", peor.nombre, peor.stock);
                    else System.out.println("No hay componentes.");
                    break;
                case 5:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }

    private static void mostrar(Componente[] items, int n) {
        if (n==0) { System.out.println("Sin componentes."); return; }
        for (int i=0;i<n;i++) {
            Componente c = items[i];
            System.out.printf("%d) %s - %s - Stock: %d - Precio: %.2f%n",
                    i+1, c.nombre, c.fabricante, c.stock, c.precio);
        }
    }

    private static double precioMedio(Componente[] items, int n) {
        if (n==0) return 0.0;
        double suma=0;
        for (int i=0;i<n;i++) suma += items[i].precio;
        return suma / n;
    }

    private static Componente menorStock(Componente[] items, int n) {
        if (n==0) return null;
        Componente m = items[0];
        for (int i=1;i<n;i++) if (items[i].stock < m.stock) m = items[i];
        return m;
    }

    private static int safeNextInt(Scanner sc) {
        while (true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Entero inválido, prueba de nuevo: "); }
        }
    }

    private static double safeNextDouble(Scanner sc) {
        while (true) {
            try { return Double.parseDouble(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Número inválido, prueba de nuevo: "); }
        }
    }
}

class Componente {
    String nombre;     // nombre del componente (ej. RAM, SSD)
    String fabricante; // fabricante (ej. Kingston, Samsung)
    int stock;         // unidades en stock
    double precio;     // precio unitario

    public Componente(String nombre, String fabricante, int stock, double precio) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.stock = stock;
        this.precio = precio;
    }
}