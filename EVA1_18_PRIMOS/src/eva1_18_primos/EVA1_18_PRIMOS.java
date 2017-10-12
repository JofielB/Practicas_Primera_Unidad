/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_primos;

import java.util.Scanner;

/**
 *
 * @author JOFIEL BATISTA 14061213  
 */
public class EVA1_18_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PEDIR UN NUMERO 
        Scanner pedir = new Scanner(System.in);
        System.out.println("Ingresa Un Numero:");
        long n = pedir.nextLong();
        boolean verificacion = false;
        //NUMERO PRIMO METODO 1
        for (int i = 2; i < n; i++) {
            System.out.println("" + i);//EJECUCION
            if (n % i == 0) {
                verificacion = true;
                
                break;
            }
        }
        if(verificacion)
            System.out.println(""+n+" NO ES PRIMO");
        else
            System.out.println(""+n+" ES PRIMO");
        
        //NUMERO PRIMO METODO 2
        verificacion = false;
        for (int i = 2; i <= (long)(Math.sqrt(n)); i++) {
            System.out.println("" + i);//EJECUCION
            if (n % i == 0) {
                verificacion = true;
                break;
            }
        }
        if(verificacion)
            System.out.println(""+n+" NO ES PRIMO");
        else
            System.out.println(""+n+" ES PRIMO");
    }
}
