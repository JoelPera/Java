package ejemplos.POO;


import java.util.Scanner;

/*
Ventas de Videojuegos:
- Entidad: Venta (titulo, plataforma, unidades, precioUnit)
- Media: unidades vendidas promedio
- Extremo: venta con mayor facturación (unidades * precioUnit)
- Comentarios sobre lógica y Scanner
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venta[] ventas = new Venta[5];
        int idx = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- TIENDA VIDEOJUEGOS ---");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Unidades promedio (mitjana)");
            System.out.println("4. Venta con mayor facturación (mejor)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = safeNextInt(sc);

            switch (op) {
                case 1:
                    if (idx>=ventas.length) { System.out.println("Registro lleno."); }
                    else {
                        System.out.print("Título del juego: "); String t = sc.nextLine();
                        System.out.print("Plataforma: "); String p = sc.nextLine();
                        System.out.print("Unidades vendidas: "); int u = safeNextInt(sc);
                        System.out.print("Precio unitario: "); double pr = safeNextDouble(sc);
                        ventas[idx++] = new Venta(t, p, u, pr);
                        System.out.println("Venta registrada.");
                    }
                    break;
                case 2:
                    mostrar(ventas, idx);
                    break;
                case 3:
                    System.out.printf("Unidades promedio: %.2f%n", unidadesPromedio(ventas, idx));
                    break;
                case 4:
                    Venta best = mayorFacturacion(ventas, idx);
                    if (best!=null) System.out.printf("Mayor facturación: %s -> %.2f%n", best.titulo, best.total());
                    else System.out.println("No hay ventas.");
                    break;
                case 5:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    private static void mostrar(Venta[] arr, int n) {
        if (n==0) { System.out.println("Sin ventas."); return; }
        for (int i=0;i<n;i++) {
            Venta v = arr[i];
            System.out.printf("%d) %s - %s - %d uds - %.2f €/ud - Total: %.2f%n",
                    i+1, v.titulo, v.plataforma, v.unidades, v.precioUnitario, v.total());
        }
    }

    private static double unidadesPromedio(Venta[] arr, int n) {
        if (n==0) return 0.0;
        int s=0;
        for (int i=0;i<n;i++) s+=arr[i].unidades;
        return (double)s/n;
    }

    private static Venta mayorFacturacion(Venta[] arr, int n) {
        if (n==0) return null;
        Venta best = arr[0];
        for (int i=1;i<n;i++) if (arr[i].total() > best.total()) best = arr[i];
        return best;
    }

    private static int safeNextInt(Scanner sc) {
        while(true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Entero inválido: "); }
        }
    }

    private static double safeNextDouble(Scanner sc) {
        while(true) {
            try { return Double.parseDouble(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Decimal inválido: "); }
        }
    }
}

class Venta {
    String titulo;
    String plataforma;
    int unidades;
    double precioUnitario;

    public Venta(String titulo, String plataforma, int unidades, double precioUnitario) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.unidades = unidades;
        this.precioUnitario = precioUnitario;
    }

    public double total() { return unidades * precioUnitario; }
}