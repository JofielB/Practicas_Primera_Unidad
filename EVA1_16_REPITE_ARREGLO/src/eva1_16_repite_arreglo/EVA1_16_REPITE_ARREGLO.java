/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_repite_arreglo;

import java.util.Scanner;

/**
 *
 * @author jofie
 */
public class EVA1_16_REPITE_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PREGUNTAMOS POR EL TAMAÑO DEL ARREGLO Y LO LLENAMOS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int tArreglo = scanner.nextInt();
        int aNumeros[] = new int[tArreglo];
        for (int i = 0; i < tArreglo; i++) {
            System.out.println("Ingresa un numero");
            aNumeros[i] = scanner.nextInt();
        }
        //PREGUNTAMOS NUMERO A VERIFICAR Y VERIFICAMOS
        System.out.println("¿Cual numero quiere verificar?");
        int contador = 0;
        int verificar = scanner.nextInt();
        for (int i = 0; i < tArreglo; i++) {
            if (aNumeros[i] == verificar) {
                contador++;
            }
        }
        System.out.println("El numero " + verificar + " se repite " + contador + " veces");
    }

}
