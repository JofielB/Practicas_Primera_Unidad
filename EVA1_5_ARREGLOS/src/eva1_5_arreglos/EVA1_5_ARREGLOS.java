/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

/**
 *
 * @author jofie
 */
public class EVA1_5_ARREGLOS {

    /**
     */
    public final static int TAMA =10;
    public static void main(String[] args) {
        int[] arregloUno, arregloDos, ArregloTres;
        int arreglo[], noArreglo;
        
        int arregloDiez[]= new int[TAMA]; 
        //LLENARLO CON NUMERO ALEATORIOS DEL 1 A 10
        for(int i = 0; i<arregloDiez.length;i++){
            arregloDiez[i] = (int)(Math.random() * 10)+1;
        }
        //IMPRIMIMOS LOS NUMEROS ALMACENADOS EN EL ARREGLO
        for (int i : arregloDiez) {
            System.out.println("Valor: " + i);
        }
    }
    
}
