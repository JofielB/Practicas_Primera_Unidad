/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_buscar_arreglo;

import java.util.Scanner;

/**
 *
 * @author jofie
 */
public class EVA1_15_BUSCAR_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PREGUNTAR TAMAÑO DE ARREGLO Y LLENARLO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int tArreglo = scanner.nextInt();
        int aNumeros[] = new int[tArreglo];
        for (int i = 0; i < tArreglo; i++) {
            System.out.println("Ingresa un numero");
            aNumeros[i] =  scanner.nextInt();
        }
        //PREGUNTAMOS NUMERO A VERIFICAR Y VERIFICAMOS
        System.out.println("¿Cual numero quiere verificar?");
        int verificar = scanner.nextInt();
        for (int i = 0; i < tArreglo; i++) {
            if(aNumeros[i] == verificar){
                System.out.println("Esta en la posicon: " +i+ " del arreglo.");
                break;
            }
        }
    }
    
}
