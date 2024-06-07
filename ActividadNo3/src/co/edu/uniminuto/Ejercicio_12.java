/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;

/**
 *
 * @author andresalexanderrativapineda
 */

public class Ejercicio_12 {
   
/*12. Realizar un programa que genere una matriz 5x5, 
inicializarla en 2 e imprimirla.*/
    
    public static void main(String[] args) {
        // Crea una matriz 5x5
        int[][] matriz = new int[5][5];

        // Inicializar la matriz con el valor 2
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = 2;
            }
        }

        // Imprimir la matriz
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
