/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        int opcionUsuario;
        System.out.println("Ingresar el valor de la base de la figura: ");
        base = entrada.nextDouble();
        System.out.println("Ingresar el valor de la altura de la figura: ");
        altura = entrada.nextDouble();
        System.out.println("Con los datos ingresados, seleccione [1]Para "
                + "calcular el área de un cuadrado, [2]Para calcular el área"
                + " de un triángulo, o [3]Para calcular el área de un rectángulo.");
        opcionUsuario = entrada.nextInt();
        if (opcionUsuario == 1) {
            areaCuadrado(base, altura);
        } else {
            if (opcionUsuario == 2) {
                areaTriangulo(base, altura);
            } else {
                if (opcionUsuario == 3) {
                }
            }
        }
    }

    public static void areaCuadrado(double a, double b) {
        double areaCuadrado;
        areaCuadrado = a * b;
        System.out.printf("El área obtenida de la figura es: %.2f\n",
                areaCuadrado);
    }

    public static void areaTriangulo(double a, double b) {
        double areaTriangulo;
        areaTriangulo = (a * b) / 2;
        System.out.printf("El área obtenida de la figura es: %.2f\n",
                areaTriangulo);
    }

    public static void areaRectangulo(double a, double b) {
        double areaRectangulo;
        areaRectangulo = a * b;
        System.out.printf("El área obtenida de la figura es: %.2f\n",
                areaRectangulo);

    }
}
