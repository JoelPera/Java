package ejemplos.POO;

import java.util.Scanner;

/*
Gimnasio:
- Entidad: Entrenamiento (usuario, tipoClase, duracionMin, calorias)
- Media: duración media
- Extremo: sesión con más calorías quemadas (mejor)
- Comentarios sobre manejo de datos y Scanner
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entrenamiento[] sesiones = new Entrenamiento[5];
        int c = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- GIMNASIO ---");
            System.out.println("1. Registrar sesión");
            System.out.println("2. Ver sesiones");
            System.out.println("3. Duración media (mitjana)");
            System.out.println("4. Sesión con más calorías (mejor)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = safeNextInt(sc);

            switch (op) {
                case 1:
                    if (c>=sesiones.length) { System.out.println("Registro lleno."); }
                    else {
                        System.out.print("Usuario: "); String user = sc.nextLine();
                        System.out.print("Tipo de clase: "); String tipo = sc.nextLine();
                        System.out.print("Duración (min): "); int dur = safeNextInt(sc);
                        System.out.print("Calorías estimadas: "); int cal = safeNextInt(sc);
                        sesiones[c++] = new Entrenamiento(user, tipo, dur, cal);
                        System.out.println("Sesión registrada.");
                    }
                    break;
                case 2:
                    mostrar(sesiones, c);
                    break;
                case 3:
                    System.out.printf("Duración media: %.2f min%n", duracionMedia(sesiones, c));
                    break;
                case 4:
                    Entrenamiento best = masCalorias(sesiones, c);
                    if (best!=null) System.out.printf("Mayor quema: %s - %d calorías%n", best.usuario, best.calorias);
                    else System.out.println("No hay sesiones.");
                    break;
                case 5:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    private static void mostrar(Entrenamiento[] arr, int c) {
        if (c==0) { System.out.println("Sin sesiones."); return; }
        for (int i=0;i<c;i++) {
            Entrenamiento e = arr[i];
            System.out.printf("%d) %s - %s - %d min - %d cal%n",
                    i+1, e.usuario, e.tipoClase, e.duracionMin, e.calorias);
        }
    }

    private static double duracionMedia(Entrenamiento[] arr, int c) {
        if (c==0) return 0.0;
        int s=0;
        for (int i=0;i<c;i++) s += arr[i].duracionMin;
        return (double)s / c;
    }

    private static Entrenamiento masCalorias(Entrenamiento[] arr, int c) {
        if (c==0) return null;
        Entrenamiento m = arr[0];
        for (int i=1;i<c;i++) if (arr[i].calorias > m.calorias) m = arr[i];
        return m;
    }

    private static int safeNextInt(Scanner sc) {
        while (true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Entrada inválida, introduce entero: "); }
        }
    }
}

class Entrenamiento {
    String usuario;   // nombre del usuario
    String tipoClase; // tipo de entrenamiento (ej: Spinning)
    int duracionMin;  // duración en minutos
    int calorias;     // calorías estimadas quemadas

    public Entrenamiento(String usuario, String tipoClase, int duracionMin, int calorias) {
        this.usuario = usuario;
        this.tipoClase = tipoClase;
        this.duracionMin = duracionMin;
        this.calorias = calorias;
    }
}