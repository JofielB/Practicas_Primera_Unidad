/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_min_max_arreglo;

import java.util.Scanner;

/**
 *
 * @author jofie
 */
public class EVA1_17_MIN_MAX_ARREGLO {

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
        
        //BUSCAMOS VALOR MAX Y MIN
        System.out.println("Valores MAX y MIN");
        int max = aNumeros[0];
        int min = aNumeros[0];
        for (int i = 0; i < tArreglo; i++) {
            if (aNumeros[i] >  max) {
                max = aNumeros[i];
            }
            if(aNumeros[i] <  min) {
                min = aNumeros[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    
}
