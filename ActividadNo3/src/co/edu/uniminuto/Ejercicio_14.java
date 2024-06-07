/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;

/**
 *
 * @author andresalexanderrativapineda
 */
import java.util.Random;

public class Ejercicio_14 {
    
/*14. Realizar un programa que genere un arreglo de 50 posiciones
y se rellene de con la función ramdom de Java (los números deben ser 1 a 99), 
luego de llenar hacer la impresión de la matriz.*/
    
    public static void main(String[] args) {
        int[] arreglo = new int[50];

        // Rellenar el arreglo con números aleatorios entre 1 y 99
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(99) + 1;
        }

        // Imprimir el contenido del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
