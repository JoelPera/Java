package ejemplos.POO;

import java.util.Scanner;

/*
Ejercicio 1: Biblioteca
- Clase entidad: Libro (4 atributos)
- Clase principal: Ejercicio1 con menu interactivo
- Funciones: calcular media de páginas y libro con más páginas (extremo)
- Comentarios educativos en español explicando cada paso y uso de Scanner
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        // Scanner para entrada por teclado. Se usa uno solo y se cierra al final.
        Scanner sc = new Scanner(System.in);

        // Array para almacenar hasta 5 libros (puedes ampliar tamaño).
        Libro[] libros = new Libro[5];
        int count = 0; // número real de libros registrados

        // Bucle principal del menú: while con switch para manejar opciones.
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- BIBLIOTECA ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Mostrar media de páginas");
            System.out.println("4. Mostrar libro con más páginas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opt = safeNextInt(sc); // leer entero de forma segura

            switch (opt) {
                case 1:
                    if (count >= libros.length) {
                        System.out.println("Capacidad llena. No se puede registrar más.");
                    } else {
                        // Lectura de cadenas tras enter: usamos nextLine correctamente.
                        System.out.print("Título: ");
                        String titulo = sc.nextLine(); // leer línea completa
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Páginas (entero): ");
                        int paginas = safeNextInt(sc); // leer entero
                        System.out.print("Valoración (0.0-5.0): ");
                        double valoracion = safeNextDouble(sc); // leer double

                        // Crear y almacenar el objeto Libro.
                        libros[count++] = new Libro(titulo, autor, paginas, valoracion);
                        System.out.println("Libro registrado.");
                    }
                    break;
                case 2:
                    mostrarCatalogo(libros, count);
                    break;
                case 3:
                    System.out.printf("Media de páginas: %.2f%n", mediaPaginas(libros, count));
                    break;
                case 4:
                    Libro mayor = libroMasPaginas(libros, count);
                    if (mayor != null) {
                        System.out.printf("Libro con más páginas: %s (%d páginas)%n", mayor.titulo, mayor.paginas);
                    } else {
                        System.out.println("No hay libros registrados.");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close(); // cerrar Scanner para liberar recursos
    }

    // Función para mostrar catálogo: recorre el array hasta 'count'.
    private static void mostrarCatalogo(Libro[] libros, int count) {
        if (count == 0) {
            System.out.println("Catálogo vacío.");
            return;
        }
        for (int i = 0; i < count; i++) {
            Libro l = libros[i];
            System.out.printf("%d) %s - %s - %d páginas - Valoración: %.1f%n",
                    i + 1, l.titulo, l.autor, l.paginas, l.valoracion);
        }
    }

    // Media de páginas: suma y división por cantidad (mitjana).
    private static double mediaPaginas(Libro[] libros, int count) {
        if (count == 0) return 0.0;
        int suma = 0;
        for (int i = 0; i < count; i++) {
            suma += libros[i].paginas;
        }
        return (double) suma / count;
    }

    // Extremo: libro con mayor número de páginas.
    private static Libro libroMasPaginas(Libro[] libros, int count) {
        if (count == 0) return null;
        Libro mejor = libros[0];
        for (int i = 1; i < count; i++) {
            if (libros[i].paginas > mejor.paginas) {
                mejor = libros[i];
            }
        }
        return mejor;
    }

    // Métodos auxiliares para lectura segura y limpieza de buffer.
    private static int safeNextInt(Scanner sc) {
        while (true) {
            try {
                int v = Integer.parseInt(sc.nextLine().trim());
                return v;
            } catch (Exception e) {
                System.out.print("Entrada inválida. Ingresa un entero: ");
            }
        }
    }

    private static double safeNextDouble(Scanner sc) {
        while (true) {
            try {
                double v = Double.parseDouble(sc.nextLine().trim());
                return v;
            } catch (Exception e) {
                System.out.print("Entrada inválida. Ingresa un número (ej: 3.5): ");
            }
        }
    }
}

// Clase entidad Libro con 4 atributos y comentarios explicativos.
class Libro {
    String titulo;     // título del libro
    String autor;      // autor del libro
    int paginas;       // número de páginas (usado para medias y extremos)
    double valoracion; // valoración media (ejemplo adicional)

    public Libro(String titulo, String autor, int paginas, double valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.valoracion = valoracion;
    }
}