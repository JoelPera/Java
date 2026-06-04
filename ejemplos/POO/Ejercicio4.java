package ejemplos.POO;

import java.util.Scanner;

/*
Veterinaria:
- Entidad: Mascota (nombre, especie, edad, peso)
- Media: peso medio de mascotas
- Extremo: mascota con mayor peso
- Comentarios: por qué usar bucles y cómo limpiar buffer
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mascota[] pets = new Mascota[5];
        int m = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- VETERINARIA ---");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Peso medio (mitjana)");
            System.out.println("4. Mascota más pesada (pitjor)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = safeNextInt(sc);

            switch (op) {
                case 1:
                    if (m>=pets.length) { System.out.println("Capacidad alcanzada."); }
                    else {
                        System.out.print("Nombre: "); String nombre = sc.nextLine();
                        System.out.print("Especie: "); String especie = sc.nextLine();
                        System.out.print("Edad (años): "); int edad = safeNextInt(sc);
                        System.out.print("Peso (kg, decimal): "); double peso = safeNextDouble(sc);
                        pets[m++] = new Mascota(nombre, especie, edad, peso);
                        System.out.println("Mascota registrada.");
                    }
                    break;
                case 2:
                    mostrar(pets, m);
                    break;
                case 3:
                    System.out.printf("Peso medio: %.2f kg%n", pesoMedio(pets, m));
                    break;
                case 4:
                    Mascota mayor = masPesada(pets, m);
                    if (mayor!=null) System.out.printf("Más pesada: %s - %.2f kg%n", mayor.nombre, mayor.peso);
                    else System.out.println("No hay mascotas.");
                    break;
                case 5:
                    salir = true; break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    private static void mostrar(Mascota[] pets, int m) {
        if (m==0) { System.out.println("No hay mascotas."); return; }
        for (int i=0;i<m;i++) {
            Mascota p = pets[i];
            System.out.printf("%d) %s - %s - %d años - %.2f kg%n",
                    i+1, p.nombre, p.especie, p.edad, p.peso);
        }
    }

    private static double pesoMedio(Mascota[] pets, int m) {
        if (m==0) return 0.0;
        double suma=0;
        for (int i=0;i<m;i++) suma += pets[i].peso;
        return suma / m;
    }

    private static Mascota masPesada(Mascota[] pets, int m) {
        if (m==0) return null;
        Mascota max = pets[0];
        for (int i=1;i<m;i++) if (pets[i].peso > max.peso) max = pets[i];
        return max;
    }

    private static int safeNextInt(Scanner sc) {
        while (true) {
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Valor entero inválido, prueba de nuevo: "); }
        }
    }

    private static double safeNextDouble(Scanner sc) {
        while (true) {
            try { return Double.parseDouble(sc.nextLine().trim()); }
            catch (Exception e) { System.out.print("Valor decimal inválido, prueba de nuevo: "); }
        }
    }
}

class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}