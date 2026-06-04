package ejemplos.POO;


import java.util.Scanner;

/*
Consumo eléctrico:
- Entidad: Medidor (habitacion, consumoKwh, tarifa, horasUso)
- Media: consumo medio (kWh)
- Extremo: habitación con mayor consumo total (consumoKwh * horas)
- Comentarios: uso de cálculos y lectura segura
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medidor[] arr = new Medidor[5];
        int cnt = 0;

        boolean salir = false;
        while(!salir) {
            System.out.println("\n--- CONSUMO ELÉCTRICO ---");
            System.out.println("1. Registrar medidor");
            System.out.println("2. Mostrar medidores");
            System.out.println("3. Consumo medio (mitjana)");
            System.out.println("4. Habitación con mayor consumo (pitjor)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = safeNextInt(sc);

            switch(op) {
                case 1:
                    if (cnt>=arr.length) { System.out.println("Capacidad llena."); }
                    else {
                        System.out.print("Habitación: "); String hab = sc.nextLine();
                        System.out.print("Consumo kWh (por hora): "); double kwh = safeNextDouble(sc);
                        System.out.print("Tarifa por kWh: "); double tarifa = safeNextDouble(sc);
                        System.out.print("Horas uso (al día): "); int horas = safeNextInt(sc);
                        arr[cnt++] = new Medidor(hab, kwh, tarifa, horas);
                        System.out.println("Medidor registrado.");
                    }
                    break;
                case 2:
                    mostrar(arr, cnt);
                    break;
                case 3:
                    System.out.printf("Consumo medio (kWh por hora): %.2f%n", consumoMedio(arr, cnt));
                    break;
                case 4:
                    Medidor m = mayorConsumo(arr, cnt);
                    if (m!=null) System.out.printf("Mayor consumo: %s -> total diario: %.2f kWh%n", m.habitacion, m.consumoDiario());
                    else System.out.println("No hay datos.");
                    break;
                case 5:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    private static void mostrar(Medidor[] arr, int cnt) {
        if (cnt==0) { System.out.println("Sin medidores."); return; }
        for (int i=0;i<cnt;i++) {
            Medidor m = arr[i];
            System.out.printf("%d) %s - %.2f kWh/h - Tarifa: %.2f - Horas: %d%n",
                    i+1, m.habitacion, m.consumoKwh, m.tarifa, m.horasUso);
        }
    }

    private static double consumoMedio(Medidor[] arr, int cnt) {
        if (cnt==0) return 0.0;
        double s=0;
        for (int i=0;i<cnt;i++) s += arr[i].consumoKwh;
        return s / cnt;
    }

    private static Medidor mayorConsumo(Medidor[] arr, int cnt) {
        if (cnt==0) return null;
        Medidor best = arr[0];
        for (int i=1;i<cnt;i++) if (arr[i].consumoDiario() > best.consumoDiario()) best = arr[i];
        return best;
    }

    private static int safeNextInt(Scanner sc) {
        while(true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Entero inválido, inténtalo otra vez: "); }
        }
    }

    private static double safeNextDouble(Scanner sc) {
        while(true) {
            try { return Double.parseDouble(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Decimal inválido, inténtalo otra vez: "); }
        }
    }
}

class Medidor {
    String habitacion;   // nombre de la habitación o aparato
    double consumoKwh;   // consumo por hora en kWh
    double tarifa;       // tarifa por kWh
    int horasUso;        // horas de uso al día

    public Medidor(String habitacion, double consumoKwh, double tarifa, int horasUso) {
        this.habitacion = habitacion;
        this.consumoKwh = consumoKwh;
        this.tarifa = tarifa;
        this.horasUso = horasUso;
    }

    // Consumo diario en kWh (uso para criterio extremo)
    public double consumoDiario() {
        return consumoKwh * horasUso;
    }
}