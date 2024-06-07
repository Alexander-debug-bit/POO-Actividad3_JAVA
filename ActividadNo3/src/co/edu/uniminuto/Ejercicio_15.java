/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;

/**
 *
 * @author andresalexanderrativapineda
 */
import java.util.Scanner;

public class Ejercicio_15 {
    
/*15. Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente 
con los números impares partiendo desde n (n es dada por el usuario) y se
imprima. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario el valor inicial 'n'
        System.out.print("Ingrese el valor inicial (n): ");
        int n = scanner.nextInt();

        // Creamos la matriz de 5x6
        int[][] matriz = new int[5][6];

        // Rellenamos la matriz con números impares
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                matriz[fila][columna] = n;
                n += 2; // Incrementamos 'n' en 2 para obtener el siguiente número impar
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz generada:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }

        scanner.close();
    }
}
