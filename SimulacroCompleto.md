# SIMULACRO DE EXAMEN - 3 TEMAS PRINCIPALES
## 3 Ejercicios por Tema

---

# TEMA 1: Arrays y Procesamiento de Datos

## Ejercicio 1.1: Array Simétrico

**Enunciado:**
Crea un programa que determine si un array de enteros es simétrico (los elementos en posiciones espejo son iguales).

**Requisitos:**
- Función `llegeixArray(int allargada)`: lee un array de tamaño especificado
- Función `esSimetric(int array[])`: verifica si es simétrico
- Mostrar el array y si es simétrico o no

**Entrada:**
Mida de l'array: 5
5 3 7 3 5

**Salida Esperada:**
L'array [5, 3, 7, 3, 5] és simètric.


**Tiempo: 20-30 minutos**

---

## Ejercicio 1.2: Gestión de Estudiantes

**Enunciado:**
Crea un programa para gestionar calificaciones de estudiantes. Debes crear una clase `Estudiant` que almacene: nombre y 3 notas. El programa debe:
- Registrar N estudiantes
- Calcular la media de notas de todos los estudiantes
- Encontrar el estudiante con la nota más baja en cualquier asignatura
- Mostrar menú con opciones

**Requisitos:**
- Clase `Estudiant` con nombre y 3 notas
- Función `mitjana(Estudiant estudiants[])`: calcula media general
- Función `pitjorNota(Estudiant estudiants[])`: encuentra estudiante con peor nota
- Menú interactivo

**Entrada:**
Quants estudiants? 3
Estudiant 1:
Nom: Joan
Nota 1: 7.5
Nota 2: 8.0
Nota 3: 6.5
Estudiant 2:
Nom: Maria
Nota 1: 9.0
Nota 2: 8.5
Nota 3: 9.5
Estudiant 3:
Nom: Pere
Nota 1: 6.0
Nota 2: 5.5
Nota 3: 7.0


**Salida Esperada:**
Mitjana de notes
Pitjor nota
Sortir
Opció: 1
Mitjana: 7.58
Opció: 2
Pitjor nota: Pere (5.5)

Opció: 0



**Tiempo: 25-35 minutos**

---

## Ejercicio 1.3: Análisis de Ventas Semanales

**Enunciado:**
Crea un programa que analice las ventas diarias de una tienda durante una semana (7 días). Debe:
- Leer las ventas de cada día
- Calcular la media de ventas
- Encontrar el día con mayor venta
- Contar cuántos días superaron la media
- Mostrar estadísticas

**Requisitos:**
- Función `llegeixVentes()`: lee ventas de 7 días
- Función `calcularMitjana(double ventas[])`: calcula promedio
- Función `obteMaxim(double ventas[])`: encuentra día con mayor venta
- Función `comptaSuperiorsMitjana(double ventas[])`: cuenta días sobre media

**Entrada:**
Ventes de cada dia:
Dia 1: 250.50
Dia 2: 180.00
Dia 3: 320.75
Dia 4: 290.25
Dia 5: 210.00
Dia 6: 350.60
Dia 7: 265.30


**Salida Esperada:**

Venta mitjana: 266.91€
Venta màxima: 350.60€ (dia 6)
Dies per sobre de la mitjana: 4


**Tiempo: 20-30 minutos**

---

---

# TEMA 2: POO - Herencia, Polimorfismo y Gestión de Colecciones

## Ejercicio 2.1: Gestión de Actuaciones Musicales

**Enunciado:**
Crea un sistema de gestión de actuaciones musicales. Hay dos tipos:
- **Concert**: en una sala con aforo limitado
- **Festival**: en un festival con escenario

Cada actuación tiene: ID, grupo, fecha, precio base
- Concert suma: precio base + (aforo * 2)
- Festival suma: precio base + 20

Implementa:
- Clase abstracta `Actuacio` con métodos abstractos
- Clases `ActuacioConcert` y `ActuacioFestival`
- Clase `GestorActuacions` con TreeMap
- Excepciones personalizadas

**Requisitos:**
- Agregar actuaciones (validar que no exista ID duplicado)
- Mostrar todas las actuaciones
- Buscar por ID
- Eliminar actuaciones
- Filtrar por tipo (Concert/Festival)
- Calcular precio final según tipo

**Entrada:**

Afegir Concert
ID: C001
Grup: Els Catarres
Data: 2025-06-10
Preu base: 300
Sala: Sala Apolo
Aforament: 200

Afegir Festival
ID: F001
Grup: Doctor Prats
Data: 2025-07-20
Preu base: 800
Festival: Canet Rock
Escenari: Principal

**Salida Esperada:**
Actuació C001 afegida correctament.
Actuació F001 afegida correctament.

--- Totes les actuacions ---
[codi=C001, grup=Els Catarres, data=2025-06-10, preu=700]
[codi=F001, grup=Doctor Prats, data=2025-07-20, preu=820]


**Excepciones:**
- `ActuacioDuplicadaException`: si existe ID
- `ActuacioNoExisteixException`: si no existe ID

**Tiempo: 40-50 minutos**

---

## Ejercicio 2.2: Gestor de Libros con Inheritance

**Enunciado:**
Crea un sistema para gestionar diferentes tipos de libros:
- **LibroPapel**: con número de páginas
- **LibroDigital**: con tamaño en MB

Cada libro tiene: ID, título, autor, precio base
- LibroPapel suma: precio base + (páginas * 0.1)
- LibroDigital suma: precio base + (tamaño * 0.5)

Implementa:
- Clase abstracta `Libro`
- Clases `LibroPapel` y `LibroDigital`
- Clase `GestorLibros` con HashMap
- Búsqueda por autor, género
- Filtrado por precio

**Requisitos:**
- CRUD completo (Create, Read, Update, Delete)
- Listar libros ordenados por precio
- Búsqueda por autor
- Calcular precio final según tipo
- Manejo de excepciones

**Entrada:**
Nuevo libro papel:
ID: L001
Título: Don Quijote
Autor: Cervantes
Precio base: 25.00
Páginas: 800

Nuevo libro digital:
ID: L002
Título: Clean Code
Autor: Martin
Precio base: 30.00
Tamaño (MB): 15


**Salida Esperada:**
L001: Don Quijote - Cervantes - 105.00€
L002: Clean Code - Martin - 37.50€


**Tiempo: 35-45 minutos**

---

## Ejercicio 2.3: Gestor de Empleados con Polimorfismo

**Enunciado:**
Crea un sistema para gestionar empleados de diferentes departamentos:
- **EmpleadoTienda**: con comisión por ventas
- **EmpleadoAdmin**: con bonificación fija

Cada empleado tiene: ID, nombre, salario base
- EmpleadoTienda: salario base + (comisión * %)
- EmpleadoAdmin: salario base + bonificación

Implementa:
- Clase abstracta `Empleado`
- Clases `EmpleadoTienda` y `EmpleadoAdmin`
- Clase `GestorEmpleados` con TreeMap (ordenado por ID)
- Cálculo de nómina total
- Búsqueda y filtrado

**Requisitos:**
- Agregar empleados (validar ID único)
- Calcular salario final según tipo
- Mostrar empleados ordenados por salario
- Listar empleados de un departamento
- Calcular nómina total de la empresa
- Manejo de excepciones

**Entrada:**
Empleado Tienda:
ID: E001
Nombre: Joan
Salario: 1000
Comisión: 500
%: 10

Empleado Admin:
ID: E002
Nombre: Maria
Salario: 1500
Bonificación: 200

**Salida Esperada:**
E001 - Joan (Tienda): 1050.00€
E002 - Maria (Admin): 1700.00€
Nómina total: 2750.00€


**Tiempo: 40-50 minutos**

---

---

# RESUMEN DE TEMAS

## TEMA 1: Arrays y Procesamiento de Datos
- ✅ Lectura de arrays
- ✅ Búsqueda de propiedades
- ✅ Cálculos estadísticos
- ✅ Métodos reutilizables
- ✅ Menús interactivos

## TEMA 2: POO - Herencia y Polimorfismo
- ✅ Clases abstractas
- ✅ Herencia y override de métodos
- ✅ Colecciones (TreeMap, HashMap)
- ✅ Excepciones personalizadas
- ✅ CRUD básico
- ✅ Interfaz Comparable

---

## CRITERIOS DE EVALUACIÓN

- ✅ **Funcionalidad completa**: todas las operaciones funcionan
- ✅ **Validación de entradas**: no permitir datos inválidos
- ✅ **Manejo de errores**: excepciones controladas
- ✅ **Código organizado**: métodos con responsabilidades claras
- ✅ **Nombres descriptivos**: variables y métodos claros
- ✅ **Formato de salida**: mensajes legibles y estructurados
- ✅ **Eficiencia**: uso adecuado de estructuras de datos

---

## CONSEJOS PARA EL EXAMEN

1. **Lee completamente el enunciado** antes de empezar
2. **Planifica la estructura** antes de codificar
3. **Implementa lo básico primero**, luego mejora
4. **Prueba con múltiples casos** de entrada
5. **Valida todas las entradas** del usuario
6. **Maneja excepciones** adecuadamente
7. **Documenta código complejo** con comentarios
8. **Revisa código** antes de entregar

---

## TIEMPO TOTAL RECOMENDADO

- **Tema 1 (3 ejercicios)**: 65-95 minutos
- **Tema 2 (3 ejercicios)**: 115-145 minutos
- **Total**: 180-240 minutos (3-4 horas)

¡Mucho éxito en el examen!