/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {

        String cadena = "";

        for (int[] dato : datos) {
            for (int col = 0; col < datos[0].length; col++) {
                if ((dato[col] % 2) == 0) {
                    cadena = String.format("%s %d", cadena, dato[col]);
                }
            }
        }
        System.out.println(cadena);
    }

}
