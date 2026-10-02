# Tabla Multiplicar

## Descripción

Aplicación de consola desarrollada en Java que permite generar la tabla de multiplicar de un número determinado hasta un límite indicado por el usuario.

El programa solicita el número de la tabla y el límite hasta el cual se desea generar, mostrando cada operación y su resultado en consola.

## Objetivo

Practicar los fundamentos de programación en Java mediante un proyecto sencillo, aplicando:

- Clases y objetos.
- Métodos.
- Parámetros.
- Estructuras de control.
- Ciclo `for`.
- Condicionales `if/else`.
- Entrada de datos mediante `Scanner`.
- Validación de datos.

## Funcionalidades

- Solicitar al usuario el número de la tabla.
- Solicitar el límite hasta el cual se desea generar.
- Generar la tabla mediante un ciclo `for`.
- Mostrar cada multiplicación y su resultado.
- Validar que el número de la tabla sea mayor o igual a `1`.
- Validar que el límite sea mayor que `0`.
- Mostrar `Invalido` cuando los datos ingresados no cumplen las condiciones establecidas.

## Tecnologías

- Java 21
- Eclipse Temurin JDK 21
- IntelliJ IDEA
- Git
- GitHub

## Estructura del proyecto

```text
TablaMultiplicar/
│
├── src/
│   ├── Main.java
│   └── Tabla.java
│
├── .gitignore
└── README.md
```

## Ejemplo de ejecución

```text
Digita el número de la tabla que deseas generar
5
¿Hasta qué número quieres generar la tabla?
10

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

### Ejemplo de validación

```text
Digita el número de la tabla que deseas generar
-5
¿Hasta qué número quieres generar la tabla?
6

Invalido
```