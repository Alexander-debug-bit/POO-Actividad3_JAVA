/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;

/**
 *
 * @author andresalexanderrativapineda
 */
public class Ejercicio_13 {
    
/*13. Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
principal con el número “0”(cero), el resto de las posiciones deben ser - (guion).
Imprimir la matriz.*/
    
    public static void main(String[] args) {
        // Crear una matriz 7x7
        char[][] matriz = new char[7][7];

        // Inicializar la matriz con guiones
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = '-';
            }
        }

        // Inicializar la diagonal principal con ceros
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = '0';
        }

        // Imprimir la matriz
        for (char[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
