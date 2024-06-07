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

public class Ejercicio9 {
    
/*9. Leer N cantidad de notas (validar rango de notas), imprimir el promedio
de las notas, la nota más alta y la más baja.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N; // Cantidad de notas
        double suma = 0; // Suma de las notas
        double notaMaxima = Double.MIN_VALUE; // Inicializar con el valor mínimo posible
        double notaMinima = Double.MAX_VALUE; // Inicializar con el valor máximo posible

        System.out.print("Ingrese la cantidad de notas a promediar: ");
        N = leer.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = leer.nextDouble();

            // Validar rango de notas (por ejemplo, entre 0 y 10)
            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Intente nuevamente.");
                i--; // Restar 1 al contador para repetir la entrada de nota
                continue;
            }

            suma += nota; // Acumular la suma de las notas

            // Actualizar nota máxima y mínima
            notaMaxima = Math.max(notaMaxima, nota);
            notaMinima = Math.min(notaMinima, nota);
        }

        double promedio = suma / N;

        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Nota más alta: " + notaMaxima);
        System.out.println("Nota más baja: " + notaMinima);
    }
}
