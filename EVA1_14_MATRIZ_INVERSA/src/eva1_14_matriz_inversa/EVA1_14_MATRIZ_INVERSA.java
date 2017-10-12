/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_matriz_inversa;

import java.util.Scanner;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA1_14_MATRIZ_INVERSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //PREGUNTAMOS POR EL TAMAÑO DEL ARRAY
        System.out.println("Indica el tamaño de los array");
        int tArray = scanner.nextInt();
        int numeros[] = new int[tArray];
        //LLENAMOS EL ARRAY DE NUMEROS 
        for (int i = 0; i < tArray; i++) {
            System.out.println("Ingresa un numero al array");
            numeros[i]=scanner.nextInt();
        }
        //CREAMOS UN ARRAY CON LOS VALORES INVERTIDOS
        int numerosInv[] = new int[tArray];
        for (int i = 0, o = tArray-1; i < tArray; i++,o--) {
            numerosInv[i] = numeros[o];
        }
        //IMPRIMIMOS AMBOS ARRAYS PARA COMPROBAR
        System.out.println("Array Original:");
        for (int i = 0; i < tArray; i++) {
            System.out.print("["+numeros[i] +"]");
        }
        System.out.println("");
        
        System.out.println("Array Invertido:");
        for (int i = 0; i < tArray; i++) {
            System.out.print("["+numerosInv[i] +"]");
        }
    }
    
}
