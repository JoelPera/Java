$baseFolder = "ejemplos"
if (-not (Test-Path $baseFolder)) {
    New-Item -ItemType Directory -Path $baseFolder | Out-Null
}

$ejercicios = @(
@'
/*
Enunciado: Diseñar una clase Alumno con nombre, id y lista de notas.
Lee datos de 5 alumnos, calcula el promedio por alumno y muestra aprobado o reprobado.
Pistas: usa un array de objetos Alumno y un método para calcular promedios.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear y administrar alumnos con notas
    }
}
class Alumno {
    String nombre;
    String id;
    double[] notas;
}
'@,
@'
/*
Enunciado: Crear una clase Producto con nombre, precio y stock.
Lee 8 productos, actualiza stock tras una venta y muestra el inventario actualizado.
Pistas: utiliza un array de productos y un método para cambiar stock.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        // Manejar inventario de productos
    }
}
class Producto {
    String nombre;
    double precio;
    int stock;
}
'@,
@'
/*
Enunciado: Crear un registro de contactos con nombre, teléfono y email.
Permite buscar contacto por nombre y mostrar sus datos.
Pistas: usa un array de objetos Contacto y un bucle para buscar.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        // Guardar y buscar contactos
    }
}
class Contacto {
    String nombre;
    String telefono;
    String email;
}
'@,
@'
/*
Enunciado: Gestionar una biblioteca con libros que tengan título, autor, año y disponible.
Permite listar todos los libros y marcar uno como prestado.
Pistas: define clase Libro y un array para almacenarlos.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        // Administrar biblioteca
    }
}
class Libro {
    String titulo;
    String autor;
    int año;
    boolean disponible;
}
'@,
@'
/*
Enunciado: Crear una clase Empleado con nombre, cargo y salario.
Lee varios empleados y calcula la nómina total.
Pistas: usa un array y un método para sumar salarios.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        // Calcular nómina de empleados
    }
}
class Empleado {
    String nombre;
    String cargo;
    double salario;
}
'@,
@'
/*
Enunciado: Gestionar una flota de vehículos con modelo, matrícula y kilometraje.
Permite buscar un vehículo por matrícula y actualizar su kilometraje.
Pistas: utiliza un array de objetos Vehiculo.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        // Control de vehículos
    }
}
class Vehiculo {
    String modelo;
    String matricula;
    int kilometraje;
}
'@,
@'
/*
Enunciado: Crear un sistema de pedidos con cliente, producto y cantidad.
Muestra el total parcial de cada pedido.
Pistas: define clase Pedido y calcula subtotal.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        // Registrar pedidos
    }
}
class Pedido {
    String cliente;
    String producto;
    int cantidad;
    double precioUnitario;
}
'@,
@'
/*
Enunciado: Gestionar una lista de tareas con descripción, prioridad y completado.
Permite mostrar tareas pendientes ordenadas por prioridad.
Pistas: usa un array de objetos Tarea y filtra por completado.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        // Control de tareas
    }
}
class Tarea {
    String descripcion;
    int prioridad;
    boolean completado;
}
'@,
@'
/*
Enunciado: Crear un registro de películas con título, director y duración.
Permite listar solo las películas con duración menor a 120 minutos.
Pistas: define clase Pelicula y recorre el array.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        // Filtrar películas por duración
    }
}
class Pelicula {
    String titulo;
    String director;
    int duracion;
}
'@,
@'
/*
Enunciado: Gestionar cursos con nombre del curso, profesor y número de inscritos.
Calcular el curso con más inscritos.
Pistas: usa un array de objetos Curso y compara cantidades.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        // Buscar curso más popular
    }
}
class Curso {
    String nombre;
    String profesor;
    int inscritos;
}
'@,
@'
/*
Enunciado: Crear una clase CuentaBancaria con titular, número y saldo.
Realiza una transferencia entre dos cuentas y muestra saldos finales.
Pistas: método para debitar y acreditar.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        // Transferencia bancaria
    }
}
class CuentaBancaria {
    String titular;
    String numero;
    double saldo;
}
'@,
@'
/*
Enunciado: Gestionar una lista de canciones con título, artista y duración.
Calcular la duración total de la playlist.
Pistas: usa un array de objetos Cancion y suma los tiempos.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        // Playlist y tiempo total
    }
}
class Cancion {
    String titulo;
    String artista;
    int duracionSegundos;
}
'@,
@'
/*
Enunciado: Crear un registro de calificaciones con alumno, materia y nota.
Calcula el promedio general y muestra las materias con nota menor a 5.
Pistas: usa array de calificaciones, promedios y filtro.
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        // Calificaciones por materia
    }
}
class Calificacion {
    String alumno;
    String materia;
    double nota;
}
'@,
@'
/*
Enunciado: Controlar la asistencia de un grupo con nombre de alumno y presencia.
Muestra cuantos alumnos asistieron y cuantos faltaron.
Pistas: usa array de objetos Asistencia y cuenta booleanos.
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        // Reporte de asistencia
    }
}
class Asistencia {
    String nombre;
    boolean presente;
}
'@,
@'
/*
Enunciado: Gestionar inventario de supermercado con producto, categoría y cantidad.
Agrupa los productos por categoría y muestra totales por grupo.
Pistas: usa arrays y condicionales para agrupar.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        // Inventario por categoría
    }
}
class Item {
    String producto;
    String categoria;
    int cantidad;
}
'@,
@'
/*
Enunciado: Crear un menú interactivo con opciones para sumar, restar, multiplicar y dividir.
El usuario elige la operación y proporciona dos números.
Pistas: usa Scanner, switch y bucles para repetir el menú.
*/
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Implementa el menú de calculadora
    }
}
'@,
@'
/*
Enunciado: Pedir 10 edades y determinar la mayor, la menor y el promedio.
Pistas: usa un bucle for y variables para max/min/suma.
*/
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer edades y calcular estadísticas
    }
}
'@,
@'
/*
Enunciado: Mostrar todos los números pares e impares entre dos valores dados por el usuario.
Pistas: usa un bucle for desde el menor hasta el mayor y if para clasificar.
*/
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Listar pares e impares
    }
}
'@,
@'
/*
Enunciado: Generar la serie de Fibonacci hasta un límite ingresado por el usuario.
Pistas: usa un bucle while y actualiza dos variables de la serie.
*/
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Generar Fibonacci
    }
}
'@,
@'
/*
Enunciado: Leer 6 números y ordenarlos de menor a mayor.
Pistas: usa un array de enteros y un algoritmo de burbuja o selección.
*/
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ordenar números
    }
}
'@,
@'
/*
Enunciado: Crear un juego de adivinar número entre 1 y 50.
El usuario tiene 5 intentos y recibe pistas de mayor o menor.
Pistas: usa Math.random y bucle while.
*/
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Juego de adivinar
    }
}
'@,
@'
/*
Enunciado: Pedir una lista de temperaturas y permitir opciones de menú para:
1) mostrar máximas, 2) mínimas, 3) promedio, 4) salir.
Pistas: usa array y switch.
*/
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menú de temperaturas
    }
}
'@,
@'
/*
Enunciado: Calcular el total de una factura con varios productos y aplicar un descuento si el total supera un límite.
Pistas: suma precios y luego aplica descuento condicional.
*/
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Factura con descuento
    }
}
'@,
@'
/*
Enunciado: Crear un menú sencillo para registrar, mostrar y eliminar tareas.
Pistas: usa un array de String y un bucle do-while para el menú.
*/
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menú CRUD de tareas
    }
}
'@,
@'
/*
Enunciado: Pedir 5 números, luego mostrar la suma, el promedio y el mayor.
Pistas: usa un array, un bucle for y variables acumuladoras.
*/
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Estadísticas de números
    }
}
'@,
@'
/*
Enunciado: Hacer una cuenta regresiva desde un número ingresado por el usuario hasta 0.
Muestra un mensaje cuando llega a cero.
Pistas: usa un bucle for o while descendente.
*/
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cuenta regresiva
    }
}
'@,
@'
/*
Enunciado: Validar un código ficticio de 8 dígitos: debe tener exactamente 8 números y comenzar con 2.
Pistas: usa String y verifica longitud + primer carácter.
*/
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Validación de código
    }
}
'@,
@'
/*
Enunciado: Crear un menú de conversión de unidades: centímetros a metros, kilómetros a metros y Fahrenheit a Celsius.
Pistas: pide el valor y aplica la fórmula adecuada con switch.
*/
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menú de conversiones
    }
}
'@,
@'
/*
Enunciado: Pedir 12 números y contar cuántos son positivos, negativos y ceros.
Pistas: usa un bucle for y condicionales.
*/
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Clasificar números
    }
}
'@,
@'
/*
Enunciado: Pedir 5 nombres y permitir navegar con un menú: siguiente, anterior, mostrar actual y salir.
Pistas: usa un array de String y un índice actual.
*/
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Navegar entre nombres
    }
}
'@,
@'
/*
Enunciado: Leer una frase y mostrarla invertida. También cuenta cuántas vocales contiene.
Pistas: usa StringBuilder o recorre la cadena manualmente.
*/
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Invertir frase y contar vocales
    }
}
'@,
@'
/*
Enunciado: Pedir una dirección de correo electrónico y validar su estructura básica:
contiene "@", un punto después del arroba y no empieza ni termina con espacio.
Pistas: usa indexOf, lastIndexOf y trim.
*/
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Validar correo básico
    }
}
'@,
@'
/*
Enunciado: Pedir nombre y apellido, luego mostrar el resultado con la primera letra en mayúscula y el resto en minúscula.
Pistas: usa substring, toUpperCase y toLowerCase.
*/
import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Formatear nombre completo
    }
}
'@,
@'
/*
Enunciado: Leer un nombre completo y generar sus iniciales.
Ejemplo: "Ana Maria Lopez" => "AML".
Pistas: separa la frase por espacios y toma la primera letra de cada palabra.
*/
import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Generar iniciales
    }
}
'@,
@'
/*
Enunciado: Pedir una frase y reemplazar todas las apariciones de una palabra por otra.
Pistas: usa replaceAll o replace.
*/
import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reemplazar palabras
    }
}
'@,
@'
/*
Enunciado: Leer una frase y determinar cuál es la palabra más larga.
Pistas: divide la frase en palabras y compara longitudes.
*/
import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Buscar palabra más larga
    }
}
'@,
@'
/*
Enunciado: Pedir una frase, contar sus palabras y crear un acrónimo con la primera letra de cada palabra.
Pistas: usa split(" ") y concatena las iniciales.
*/
import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Contar palabras y crear acrónimo
    }
}
'@,
@'
/*
Enunciado: Leer una fecha en formato dd/mm/aaaa y mostrarla en formato "aaaa-mm-dd".
Pistas: usa split y reorganiza partes.
*/
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Formatear fecha
    }
}
'@,
@'
/*
Enunciado: Generar una contraseña segura a partir de una palabra base:
agrega números, mayúsculas y un símbolo.
Pistas: usa caracteres de la palabra original y concatena elementos extra.
*/
import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crear contraseña segura
    }
}
'@,
@'
/*
Enunciado: Pedir una palabra y verificar si es un palíndromo ignorando espacios y mayúsculas.
Pistas: normaliza la cadena y compárala con su versión invertida.
*/
import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Verificar palíndromo
    }
}
'@,
@'
/*
Enunciado: Mostrar la tabla de multiplicar de un número ingresado y además sumar todos los resultados de la tabla.
Pistas: usa un bucle for de 1 a 10.
*/
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tabla de multiplicar y suma
    }
}
'@,
@'
/*
Enunciado: Calcular el área y perímetro de un rectángulo y un círculo.
Pistas: pide base y altura para el rectángulo y radio para el círculo.
*/
import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Área y perímetro de figuras
    }
}
'@,
@'
/*
Enunciado: Convertir un número entero de base decimal a base binaria.
Pistas: usa division sucesiva o Integer.toBinaryString como referencia.
*/
import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Conversión decimal a binario
    }
}
'@,
@'
/*
Enunciado: Calcular el monto final de una inversión con interés compuesto:
A = P * (1 + r)^n.
Pistas: pide capital, tasa y años.
*/
import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Interés compuesto
    }
}
'@,
@'
/*
Enunciado: Determinar si un número es primo y mostrar sus factores si no lo es.
Pistas: usa un bucle desde 2 hasta la raíz cuadrada.
*/
import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Verificar número primo
    }
}
'@,
@'
/*
Enunciado: Resolver una ecuación lineal simple ax + b = 0 para valores a y b ingresados.
Pistas: considera el caso a = 0 por separado.
*/
import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Resolver ecuación lineal
    }
}
'@,
@'
/*
Enunciado: Calcular el promedio ponderado de tres notas con distintos pesos.
Muestra la categoría final: insuficiente, suficiente, notable o sobresaliente.
Pistas: suma (nota*peso) y divide por la suma de pesos.
*/
import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Promedio ponderado
    }
}
'@,
@'
/*
Enunciado: Calcular la suma de los dígitos de un número entero y luego repetir hasta obtener un dígito (digital root).
Pistas: convierte a String o usa divisiones sucesivas.
*/
import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Raíz digital
    }
}
'@,
@'
/*
Enunciado: Leer una serie de 7 números y calcular media, mediana y moda.
Pistas: ordena el array para la mediana y cuenta frecuencias para la moda.
*/
import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Estadísticas básicas
    }
}
'@,
@'
/*
Enunciado: Generar una matriz cuadrada de tamaño N con números aleatorios, luego mostrar la suma de la diagonal principal y secundaria.
Pistas: usa arrays bidimensionales y bucles anidados.
*/
import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Matriz y suma de diagonales
    }
}
'@
)

for ($i = 0; $i -lt $ejercicios.Count; $i++) {
    $fileName = "Ejercicio$($i + 1).java"
    $filePath = Join-Path $baseFolder $fileName
    Set-Content -Path $filePath -Value $ejercicios[$i] -Encoding UTF8
}

Write-Host "Generados $($ejercicios.Count) archivos Java en la carpeta '$baseFolder'."