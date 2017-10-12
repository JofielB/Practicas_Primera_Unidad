
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOFIEL 14061213
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DESPERDICIO DE ESPACIO
        int edades[][]= new int[4][30];
        //MANERA CORRECTA
        int edadesD[][];
        //PREGUNTAR CUANTOS GRUPOS TIENES:
        Scanner a = new Scanner(System.in);
        System.out.println("Cuantos grupos tienes?");
        int grupos = a.nextInt();
        edadesD = new int[grupos][];
        //PREGUNTAR GRUPO POR GRUPO
        for (int i = 1; i <= grupos; i++) {
            System.out.println("¿Cuantos alumnos tiene en el grupo " + i+"?");
            edadesD[i-1]= new int[a.nextInt()];
        }
        //PREGUNTAR POR EDADES
        for (int i = 1; i <= grupos; i++) {
            System.out.println("Grupo " + i +":");
            for (int j = 0; j < edadesD[i-1].length; j++) {
                System.out.println("Ingresa edad:");
                edadesD[i-1][j]= a.nextInt();
            }
        }
        //SACAR PROMEDIOS
        int cAlumnos,cEdades;
        int grupo=1;
        double promedio;
        for (int[] is : edadesD) {
            cEdades = 0;
            cAlumnos =0;
            for (int i : is) {
                cEdades += i;
                cAlumnos++;
            }
            promedio = (double) cEdades/cAlumnos;
            System.out.println("Promedio grupo " +grupo+": " + promedio);
            grupo++;
        }
    }
}
