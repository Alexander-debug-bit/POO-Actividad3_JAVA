/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author andresalexanderrativapineda
 */
public class Ejercicio7 {
    
/*7. Realizar un programa en Java que dado n cantidad de números determine si 
es primo o no y si ese número primo es múltiplo de 3, se debe contar. Imprimir
cantidad de primos y cantidad de múltiplos de 3
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a verificar: ");
        int cantidadNumeros = scanner.nextInt();
        int primos = 0;
        int multiplosDe3 = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (esPrimo(numero)) {
                primos++;
                if (numero % 3 == 0) {
                    multiplosDe3++;
                }
            }
        }

        System.out.println("Cantidad de números primos: " + primos);
        System.out.println("Cantidad de múltiplos de 3 entre los números primos: " + multiplosDe3);
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}