/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;

/**
 *
 * @author andresalexanderrativapineda
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

/*8. Dado N cantidad de precios de gaseosas en un supermercado el gerente de 
ventas desea que se genere un programa que le permita saber cuál de las gaseosas 
tiene el mayor precio, cuál tiene menor precio y cuál es el precio promedio. 
Hacer las impresiones según lo requerido*/    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> precios = new ArrayList<>();

        // Solicitar la cantidad de gaseosas
        System.out.print("Ingrese la cantidad de gaseosas: ");
        int cantidadGaseosas = scanner.nextInt();

        // Solicitar los precios de las gaseosas
        for (int i = 0; i < cantidadGaseosas; i++) {
            System.out.print("Ingrese el precio de la gaseosa " + (i + 1) + ": ");
            double precio = scanner.nextDouble();
            precios.add(precio);
        }

        // Calcular el mayor, menor y promedio de precios
        double mayorPrecio = Double.MIN_VALUE;
        double menorPrecio = Double.MAX_VALUE;
        double sumaPrecios = 0;

        for (double precio : precios) {
            if (precio > mayorPrecio) {
                mayorPrecio = precio;
            }
            if (precio < menorPrecio) {
                menorPrecio = precio;
            }
            sumaPrecios += precio;
        }

        double precioPromedio = sumaPrecios / cantidadGaseosas;

        // Mostrar los resultados
        System.out.println("Mayor precio: " + mayorPrecio);
        System.out.println("Menor precio: " + menorPrecio);
        System.out.println("Precio promedio: " + precioPromedio);
    }
}
