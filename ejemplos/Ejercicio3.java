// EJERCICIO 3: Catálogo de biblioteca
package ejemplos;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro[] biblioteca = new Libro[5];
        int totalLibros = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE BIBLIOTECA ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Estadísticas de páginas");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (totalLibros >= biblioteca.length) {
                        System.out.println("No se pueden registrar más libros.");
                    } else {
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Género: ");
                        String genero = sc.nextLine();
                        System.out.print("Número de páginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();
                        System.out.print("¿Está disponible? (s/n): ");
                        String disp = sc.nextLine();
                        boolean disponible = disp.equalsIgnoreCase("s");
                        biblioteca[totalLibros++] = new Libro(titulo, autor, genero, paginas, disponible);
                        System.out.println("Libro agregado al catálogo.");
                    }
                    break;
                case 2:
                    mostrarCatalogo(biblioteca, totalLibros);
                    break;
                case 3:
                    estadisticasPaginas(biblioteca, totalLibros);
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

    private static void mostrarCatalogo(Libro[] biblioteca, int totalLibros) {
        if (totalLibros == 0) {
            System.out.println("No hay libros en el catálogo.");
            return;
        }
        System.out.println("\nCatálogo de libros:");
        for (int i = 0; i < totalLibros; i++) {
            Libro libro = biblioteca[i];
            System.out.printf("%d) %s - %s - %s - %d páginas - Disponible: %s%n",
                    i + 1, libro.titulo, libro.autor, libro.genero, libro.paginas,
                    libro.disponible ? "Sí" : "No");
        }
    }

    private static void estadisticasPaginas(Libro[] biblioteca, int totalLibros) {
        if (totalLibros == 0) {
            System.out.println("No hay datos para calcular estadísticas.");
            return;
        }

        int sumaPaginas = 0;
        int paginasMin = biblioteca[0].paginas;
        int paginasMax = biblioteca[0].paginas;

        for (int i = 0; i < totalLibros; i++) {
            int paginas = biblioteca[i].paginas;
            sumaPaginas += paginas;
            if (paginas < paginasMin) {
                paginasMin = paginas;
            }
            if (paginas > paginasMax) {
                paginasMax = paginas;
            }
        }

        double promedioPaginas = (double) sumaPaginas / totalLibros;
        System.out.printf("Promedio de páginas: %.2f%n", promedioPaginas);
        System.out.printf("Libro con menos páginas: %d, con más páginas: %d%n", paginasMin, paginasMax);
    }
}

class Libro {
    String titulo;
    String autor;
    String genero;
    int paginas;
    boolean disponible;

    public Libro(String titulo, String autor, String genero, int paginas, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
        this.disponible = disponible;
    }
}