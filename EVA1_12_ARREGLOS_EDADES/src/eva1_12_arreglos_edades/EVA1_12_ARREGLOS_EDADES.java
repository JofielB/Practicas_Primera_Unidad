/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos_edades;

import java.util.Scanner;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA1_12_ARREGLOS_EDADES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PREGUNTAR CUANTOS ALUMNOS
        Scanner a = new Scanner(System.in);
        System.out.println("Cuantos alumnos tienes?");
        int alumnos = a.nextInt();
        //PREGUNTAR EDADES
        int edades[] = new int[alumnos];
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduce edad: ");
            edades[i] = a.nextInt();
        }
        //CALCULAR EL PROMEDIO
        int sumEdades = 0;
            for (int edade : edades) {
            sumEdades += edade;//promedio = promedio +edade
        }
        //MOSTRAR
        double promEdades = sumEdades/alumnos;
        System.out.println("El promedio es: " + promEdades);
        
        
    }   
}
