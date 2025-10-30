package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // WHILE
        // ==============================

        System.out.println("-----------------------");
        // Punto 1: ciclo de números
        int number = 0;
        while (number <= 10) {
            System.out.println("Ciclo de números: " + number);
            number++;
        }

        // Punto 2: suma de 1 a n
        int limite = 5;
        int sumaWhile = 0;
        int contador = 1;
        while (contador <= limite) {
            sumaWhile += contador;
            contador++;
        }
        System.out.println("Suma de 1 a " + limite + ": " + sumaWhile);

        // Punto 3: buscar número en arreglo
        int[] arreglo = { 3, 17, 7, 9, 15 };
        int buscar = 17; // número a buscar
        boolean encontrado = false;

        for (int num : arreglo) {
            if (num == buscar) {
                System.out.println("Número " + buscar + " encontrado en el arreglo.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Número " + buscar + " no encontrado en el arreglo.");
        }
        System.out.println("-----------------------");

        // DO-WHILE
        // ==============================

        // Punto 1: menú interactivo
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("¡Hola!");
                case 2 -> System.out.println("¡Adiós!");
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        // Punto 2: suma hasta ingresar 0
        int numero;
        int sumaDoWhile = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            sumaDoWhile += numero;
        } while (numero != 0);
        System.out.println("La suma total es: " + sumaDoWhile);

        // Punto 3: verificar contraseña
        sc.nextLine(); // limpiar buffer
        String contrasenaCorrecta = "1234";
        String ingreso;
        do {
            System.out.print("Ingrese la contraseña: ");
            ingreso = sc.nextLine();
        } while (!ingreso.equals(contrasenaCorrecta));
        System.out.println("¡Contraseña correcta!");

        System.out.println("-----------------------");
        // FOR
        // ==============================

        // Punto 1: mostrar números pares del 2 al 20
        for (int x = 2; x <= 20; x += 2) {
            System.out.println(x);
        }

        // Punto 2: factorial de un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numFactorial = sc.nextInt();
        int factorial = 1;
        for (int j = 1; j <= numFactorial; j++) {
            factorial *= j;
        }
        System.out.println("El factorial de " + numFactorial + " es: " + factorial);

        // Punto 3: sumar elementos de un arreglo
        int[] numeros = { 5, 10, 15, 20 };
        int sumaFor = 0;
        for (int k = 0; k < numeros.length; k++) {
            sumaFor += numeros[k];
        }
        System.out.println("La suma del arreglo es: " + sumaFor);

        System.out.println("-----------------------");
        // FOR-EACH
        // ==============================

        // Punto 1: suma con for-each
        int[] arrays = { 3, 6, 9, 12 };
        int sumaForEach = 0;
        for (int num : arrays) {
            sumaForEach += num;
        }
        System.out.println("La suma total es: " + sumaForEach);

        // Punto 2: mostrar palabras
        String[] palabras = { "Hola", "Mundo", "Java" };
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Punto 3: promedio de notas
        double[] notas = { 3.5, 4.0, 2.8, 5.0 };
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / notas.length;
        System.out.printf("El promedio es: %.2f%n", promedio);
        System.out.println("-----------------------");

        // 1️⃣ Ejemplo de BREAK
        // ==============================
        // Detiene completamente el ciclo al cumplirse una condición
        System.out.println("=== Ejemplo de BREAK ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) { 
                System.out.println("Se encontró el número 6. Deteniendo el ciclo.");
                break; // el ciclo se detiene completamente
            }
            System.out.println("Número: " + i);
        }
        System.out.println("-----------------------");

        // ==============================
        // 2️⃣ Ejemplo de CONTINUE
        // ==============================
        // Omite una iteración cuando se cumple una condición
        System.out.println("\n=== Ejemplo de CONTINUE ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { 
                continue; // salta el número par
            }
            System.out.println("Número impar: " + i);
        }
        System.out.println("-----------------------");

        // 3️⃣ Ejemplo combinando BREAK y CONTINUE
        // ==============================
        // Salta algunos valores y se detiene al alcanzar un límite
        System.out.println("\n=== Ejemplo de BREAK y CONTINUE ===");
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                System.out.println("Saltando múltiplo de 3: " + i);
                continue; // omite la impresión de los múltiplos de 3
            }

            if (i > 10) {
                System.out.println("Número mayor que 10. Deteniendo ciclo.");
                break; // el ciclo se detiene cuando i > 10
            }

            System.out.println("Procesando número: " + i);
        }

        System.out.println("\nPrograma terminado correctamente.");

        sc.close();
    }
}
