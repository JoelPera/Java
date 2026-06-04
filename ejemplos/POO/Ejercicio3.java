package ejemplos.POO;


import java.util.Scanner;

/*
Pacientes y tensión arterial:
- Entidad: Paciente (nombre, edad, sistolica, diastolica)
- Media: media de presión sistólica
- Extremo: paciente con tensión sistólica más alta (peor)
- Scanner: manejo cuidadoso de lectura y buffer
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente[] arr = new Paciente[5];
        int cnt = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- HOSPITAL: TENSIÓN ---");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Listar pacientes");
            System.out.println("3. Media sistólica (mitjana)");
            System.out.println("4. Paciente con sistólica más alta (pitjor)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = safeNextInt(sc);

            switch(op) {
                case 1:
                    if (cnt>=arr.length) { System.out.println("Capacidad máxima alcanzada."); }
                    else {
                        System.out.print("Nombre: "); String nombre = sc.nextLine();
                        System.out.print("Edad: "); int edad = safeNextInt(sc);
                        System.out.print("Presión sistólica (mmHg): "); int s = safeNextInt(sc);
                        System.out.print("Presión diastólica (mmHg): "); int d = safeNextInt(sc);
                        arr[cnt++] = new Paciente(nombre, edad, s, d);
                        System.out.println("Paciente agregado.");
                    }
                    break;
                case 2:
                    listar(arr, cnt);
                    break;
                case 3:
                    System.out.printf("Media sistólica: %.2f%n", mediaSistolica(arr, cnt));
                    break;
                case 4:
                    Paciente p = maximaSistolica(arr, cnt);
                    if (p!=null) System.out.printf("Peor paciente: %s - %d mmHg%n", p.nombre, p.sistolica);
                    else System.out.println("No hay pacientes.");
                    break;
                case 5:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    private static void listar(Paciente[] arr, int cnt) {
        if (cnt==0) { System.out.println("Sin pacientes."); return; }
        for (int i=0;i<cnt;i++) {
            Paciente p = arr[i];
            System.out.printf("%d) %s, %d años - %d/%d mmHg%n", i+1, p.nombre, p.edad, p.sistolica, p.diastolica);
        }
    }

    private static double mediaSistolica(Paciente[] arr, int cnt) {
        if (cnt==0) return 0.0;
        int s = 0;
        for (int i=0;i<cnt;i++) s += arr[i].sistolica;
        return (double) s / cnt;
    }

    private static Paciente maximaSistolica(Paciente[] arr, int cnt) {
        if (cnt==0) return null;
        Paciente worst = arr[0];
        for (int i=1;i<cnt;i++) if (arr[i].sistolica > worst.sistolica) worst = arr[i];
        return worst;
    }

    private static int safeNextInt(Scanner sc) {
        while (true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Entrada inválida, vuelve a intentar: "); }
        }
    }
}

class Paciente {
    String nombre; // nombre del paciente
    int edad;      // edad en años
    int sistolica; // presión sistólica en mmHg
    int diastolica;// presión diastólica en mmHg

    public Paciente(String nombre, int edad, int sistolica, int diastolica) {
        this.nombre = nombre;
        this.edad = edad;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
    }
}