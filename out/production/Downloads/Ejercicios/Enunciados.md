# Ejercicios de Práctica para Examen de Java - Miquel Turegano

## Tema 1: Matrices y Juegos 2D (Basado en Buscaminas)

### Ejercicio 1: Crear un Tablero de Números Aleatorios
Crea un programa que genere una matriz 5x5 con números aleatorios entre 1 y 100. El programa debe:
- Crear la matriz con valores aleatorios
- Mostrar la matriz en consola con formato tabla
- Calcular y mostrar la suma total de todos los números
- Encontrar el valor máximo y su posición

### Ejercicio 2: Sopa de Letras Simplificada
Crea un juego de sopa de letras simple donde:
- Se crea una matriz 4x4 con letras aleatorias
- El usuario ingresa una letra para buscar
- El programa muestra todas las posiciones donde se encuentra esa letra
- Contar cuántas veces aparece la letra

### Ejercicio 3: Juego del Gato (Tic Tac Toe)
Implementa un juego del gato (3x3) donde:
- Dos jugadores pueden marcar X y O
- Validar que no se marque una posición ya ocupada
- Detectar cuando hay ganador (tres en línea)
- Mostrar el tablero después de cada movimiento

### Ejercicio 4: Tablero de Damas Simplificado
Crea un tablero 8x8 donde:
- Inicializar posiciones de fichas (una pieza en cada esquina)
- Permitir mover una ficha a una posición adyacente
- Mostrar el tablero con las fichas
- Validar que el movimiento sea válido (dentro del tablero)

### Ejercicio 5: Laberinto Generado Aleatoriamente
Crea un laberinto 6x6 donde:
- 0 representa camino libre, 1 representa pared
- Mostrar el laberinto en consola
- Marcar inicio (S) y salida (E)
- Permitir al usuario mover por el laberinto (arriba, abajo, izquierda, derecha)

### Ejercicio 6: Sistema de Reservas de Asientos
Crea un sistema de reserva de asientos de cine donde:
- Matriz 5x8 representando asientos
- 0 = libre, 1 = ocupado
- Permitir reservar un asiento
- Mostrar disponibilidad
- Mostrar ingresos por venta de asientos

### Ejercicio 7: Tablero de Puntuaciones
Implementa un juego donde:
- Matriz 5x5 con puntos aleatorios (1-10)
- Jugador recorre recolectando puntos
- Cada punto solo se puede recoger una vez
- Mostrar puntuación total y posición actual del jugador

### Ejercicio 8: Detección de Patrones en Matriz
Crea un programa que reciba una matriz 4x4 y detecte:
- Si existe una fila con todos los mismos números
- Si existe una columna con todos los mismos números
- Si las diagonales son simétricas

---

## Tema 2: Utilidades de Entrada/Salida y Validación de Datos

### Ejercicio 9: Validador de Datos de Usuario
Crea una clase con métodos para validar:
- `validarEdad(int)`: que esté entre 0 y 120
- `validarEmail(String)`: que contenga @ y un punto
- `validarTelefono(String)`: que tenga exactamente 9 dígitos
- `validarPassword(String)`: mínimo 8 caracteres, incluya mayúscula y número

### Ejercicio 10: Sistema de Entrada Robusto
Crea una clase Utilidades que:
- Pida un entero, repitiendo si no es válido
- Pida un decimal, repitiendo si no es válido
- Pida una opción de menú (1-5), repitiendo si no es válido
- Maneje excepciones de entrada

### Ejercicio 11: Generador de Contraseñas Aleatorias
Implementa:
- `generarPassword(int longitud)`: contraseña con números, letras minúsculas, mayúsculas
- `validarPassword(String)`: verificar que cumpla requisitos
- `mostrarFortaleza(String)`: débil, media, fuerte

### Ejercicio 12: Lectura de Datos Personales
Crea un programa que lea:
- Nombre (solo letras y espacios)
- Edad (18-100)
- Salario (número positivo)
- Email (con validación)
- Mostrar un resumen formateado

### Ejercicio 13: Encuesta Interactiva
Implementa una encuesta que:
- Haga 5 preguntas múltiple opción
- Valide que la respuesta sea A, B, C o D
- Guarde las respuestas en un array
- Muestre el resumen de respuestas al final

---

## Tema 3: Algoritmos de Búsqueda y Ordenamiento

### Ejercicio 14: Búsqueda Binaria
Implementa búsqueda binaria donde:
- Array de 20 números ordenados
- Usuario busca un número
- Mostrar si se encontró y en qué posición
- Contar comparaciones realizadas

### Ejercicio 15: Búsqueda Lineal Avanzada
Crea un programa que:
- Busque todas las ocurrencias de un número en un array
- Retorne un array con las posiciones
- Calcule la distancia entre ocurrencias

### Ejercicio 16: Ordenamiento Burbuja con Estadísticas
Implementa ordenamiento burbuja que:
- Ordene un array de enteros
- Cuente intercambios realizados
- Cuente comparaciones realizadas
- Muestre el tiempo de ejecución aproximado

### Ejercicio 17: Ordenamiento por Selección
Implementa ordenamiento por selección:
- Ordene array de números flotantes
- Muestre el array después de cada pasada
- Indique cuál fue el elemento mínimo en cada iteración

### Ejercicio 18: Ordenamiento por Inserción
Implementa ordenamiento por inserción:
- Ordene array de caracteres
- Muestre visualización del proceso
- Compare eficiencia con burbuja

### Ejercicio 19: Búsqueda de Duplicados
Crea un programa que:
- Dado un array, encuentre números duplicados
- Muestre qué número está repetido y cuántas veces
- Encuentre el duplicado más frecuente
- Muestre el array sin duplicados

### Ejercicio 20: Filtrado y Búsqueda Combinada
Implementa un programa que:
- Array de 15 números
- Filtrar números pares
- Filtrar números mayores a 50
- Buscar números que cumplan ambas condiciones

---

## Tema 4: Estructuras de Datos

### Ejercicio 21: Pila (Stack) de Números
Implementa una pila con:
- Método push(elemento)
- Método pop()
- Método peek()
- Mostrar contenido de la pila
- Validar que no esté vacía antes de pop

### Ejercicio 22: Cola (Queue) de Personas
Crea una cola de espera donde:
- Agregar persona a la cola
- Atender persona (quitar de la cola)
- Mostrar posición en la cola
- Mostrar siguiente persona a atender

### Ejercicio 23: Lista Enlazada Simple
Implementa una lista enlazada con:
- Insertar al inicio
- Insertar al final
- Eliminar elemento
- Buscar elemento
- Mostrar todos los elementos

### Ejercicio 24: Pila de Caracteres para Validar Paréntesis
Crea un programa que valide:
- Que los paréntesis estén balanceados: "(())()"
- Que no haya paréntesis sin cerrar
- Mostrar posición del error si la hay

### Ejercicio 25: Cola de Impresión
Simula un sistema de cola de impresión donde:
- Agregar documentos a la cola
- Procesar documento (remover de cola)
- Mostrar orden de impresión
- Cambiar prioridad de un documento

### Ejercicio 26: Pila para Deshacer Acciones
Crea un sistema de deshacer donde:
- Agregar acción a la pila (escribir, borrar, mover)
- Deshacer (pop de la pila)
- Mostrar últimas acciones
- Mostrar si hay acciones para deshacer

---

## Tema 5: Recursividad

### Ejercicio 27: Factorial Recursivo
Implementa factorial:
- Calcular factorial(n) recursivamente
- Validar n >= 0
- Mostrar proceso de recursión
- Calcular para valores 0-10

### Ejercicio 28: Fibonacci
Crea función fibonacci recursiva:
- Calcular fib(n)
- Mostrar serie Fibonacci hasta n
- Contar cuántas veces se llama recursivamente
- Optimizar con memoización

### Ejercicio 29: Búsqueda Binaria Recursiva
Implementa búsqueda binaria recursiva:
- Array ordenado de enteros
- Buscar elemento recursivamente
- Mostrar proceso de búsqueda
- Comparar con versión iterativa

### Ejercicio 30: Suma de Array Recursiva
Implementa suma de elementos:
- `sumaArray(int[], inicio, fin)` recursivo
- Suma números entre dos índices
- Mostrar paso a paso
- Validar índices

### Ejercicio 31: Recorrido de Matriz Recursiva
Crea recursión para:
- Sumar todos los elementos de una matriz
- Encontrar máximo de una matriz
- Contar elementos que cumplen condición

### Ejercicio 32: Generador de Combinaciones
Implementa recursivamente:
- Generar todas las permutaciones de un array
- Generar todas las combinaciones de tamaño k
- Mostrar cantidad de resultados

---

## Tema 6: Problemas Integrados

### Ejercicio 33: Sistema de Carrito de Compras
Implementa un carrito donde:
- Agregar producto (nombre, precio, cantidad)
- Remover producto
- Mostrar listado con total
- Aplicar descuento a producto específico
- Mostrar resumen de compra

### Ejercicio 34: Base de Datos Simple de Estudiantes
Crea un programa que:
- Guardar datos de estudiantes (nombre, edad, calificación)
- Buscar estudiante por nombre
- Mostrar estudiantes con calificación > 7
- Calcular promedio de calificaciones
- Mostrar estudiante con mejor calificación

### Ejercicio 35: Sistema de Turnos en Hospital
Implementa un sistema donde:
- Pacientes ingresan en cola
- Asignar paciente a doctor
- Mostrar tiempo de espera estimado
- Mostrar próximo paciente a atender

### Ejercicio 36: Simulador de Máquina Expendedora
Crea una máquina expendedora que:
- Tenga 5 productos diferentes
- Usuario selecciona producto y deposita dinero
- Validar dinero suficiente
- Devolver cambio
- Actualizar stock

### Ejercicio 37: Historial de Transacciones Bancarias
Implementa un sistema de banco donde:
- Saldo inicial
- Depositar dinero
- Retirar dinero (validar saldo)
- Ver historial de transacciones
- Mostrar últimas N transacciones

### Ejercicio 38: Generador de Horarios
Crea un programa que:
- Generar horario aleatorio (8:00 a 17:00)
- Asignar tareas a horarios
- Mostrar horario ordenado
- Buscar tareas de una hora específica
- Validar no haya solapamiento

### Ejercicio 39: Sistema de Votación
Implementa un sistema de votación donde:
- Lista de candidatos
- Cada persona vota por un candidato
- Contar votos
- Mostrar ganador
- Mostrar porcentaje de votos

### Ejercicio 40: Análisis de Cadenas de Texto
Crea un programa que:
- Contar palabras en una frase
- Encontrar palabra más larga
- Invertir orden de palabras
- Contar vocales y consonantes
- Buscar palabra específica y contar ocurrencias

---

## Tema 7: Ejercicios Tipo Examen

### Ejercicio 41: Matriz de Calificaciones (Nivel Examen)
**Enunciado:**
Se requiere un sistema para gestionar calificaciones de 30 estudiantes en 5 asignaturas. Implementa:
- Matriz para almacenar notas (30x5)
- Calcular promedio por estudiante
- Calcular promedio por asignatura
- Encontrar estudiante con mejor promedio
- Contar estudiantes aprobados (promedio >= 5)
- Mostrar reporte formateado

### Ejercicio 42: Juego de Adivina el Número (Nivel Examen)
**Enunciado:**
Crea un juego donde:
- Número aleatorio entre 1 y 100
- Usuario intenta adivinar en máximo 7 intentos
- Mostrar "más alto" o "más bajo"
- Contar intentos utilizados
- Mostrar si ganó o perdió
- Opción de jugar múltiples partidas

### Ejercicio 43: Validador de Identidad (Nivel Examen)
**Enunciado:**
Crea validador de documento de identidad que:
- Valide formato (8 dígitos + letra)
- Calcule letra correcta según algoritmo
- Muestre si es válido o inválido
- Indique posición del error si hay

### Ejercicio 44: Procesador de Calificaciones (Nivel Examen)
**Enunciado:**
Dados dos arrays:
- Array de nombres (10 estudiantes)
- Array de calificaciones (10 valores)
Implementa:
- Ordenar de mayor a menor calificación
- Mantener correspondencia con nombres
- Mostrar ranking
- Asignar letra (A=9+, B=8-8.9, C=7-7.9, etc)

### Ejercicio 45: Simulador de Logueo (Nivel Examen)
**Enunciado:**
Crea un sistema de login que:
- Tenga 3 usuarios predefinidos (usuario/contraseña)
- Máximo 3 intentos
- Bloquear cuenta después de 3 fallos
- Mostrar menú diferente según usuario
- Opción de recuperar contraseña

---

## Notas para el Examen

**Tópicos Clave Cubiertos:**
- ✅ Matrices y arrays bidimensionales
- ✅ Juegos y simulaciones 2D
- ✅ Validación de entrada de datos
- ✅ Algoritmos de búsqueda (lineal y binaria)
- ✅ Algoritmos de ordenamiento (burbuja, selección, inserción)
- ✅ Estructuras de datos (pila, cola, lista enlazada)
- ✅ Recursividad
- ✅ Problemas integrados y complejos
- ✅ Manejo de excepciones
- ✅ Formateo de salida

**Consejos para el Examen:**
1. Lee completamente cada enunciado antes de empezar
2. Identifica entrada, procesamiento y salida requerida
3. Usa métodos para reutilizar código
4. Valida todas las entradas del usuario
5. Prueba casos límite (array vacío, números negativos, etc.)
6. Usa nombres descriptivos para variables
7. Comenta código complejo
8. Gestiona excepciones adecuadamente

**Tiempo Estimado de Desarrollo:**
- Ejercicios 1-10: 15-20 minutos cada uno
- Ejercicios 11-30: 20-30 minutos cada uno
- Ejercicios 31-40: 30-45 minutos cada uno
- Ejercicios 41-45: 45-60 minutos cada uno

¡Mucho éxito en tu examen!