/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Aquí creo una matriz de 3 filas por 3 columnas para guardar las edades
        int[][] matriz = new int[3][3]; 
        int suma = 0; // Variable para acumular la suma de todas las edades
        int contador = 0; // Esta variable contará cuántos números se ingresaron

        // En este ciclo voy pidiendo al usuario que ingrese las edades
        System.out.println("Ingrese las edades para llenar la matriz 3x3:");
        for (int i = 0; i < 3; i++) { // recorro las filas
            for (int j = 0; j < 3; j++) { // recorro las columnas
                System.out.print("Edad en [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt(); // guardo la edad en la posición
                suma += matriz[i][j]; // voy sumando las edades
                contador++; // incremento el contador de elementos
            }
        }

        // Ahora muestro la matriz con los valores que ingresó el usuario
        System.out.println("\nMatriz de edades:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); // imprimo
            }
            System.out.println(); // salto de línea para que quede en forma de matriz
        }

        // Aquí muestro la cantidad total de elementos ingresados
        System.out.println("\nCantidad de elementos ingresados: " + contador);

        // Calculo el promedio dividiendo la suma entre la cantidad de elementos
        double promedio = (double) suma / contador;
        System.out.println("Promedio de edades: " + promedio);
    }
}

