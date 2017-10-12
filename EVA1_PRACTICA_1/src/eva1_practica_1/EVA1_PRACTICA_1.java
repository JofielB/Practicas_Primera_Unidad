package eva1_practica_1;
import java.util.Scanner;
/**
 *
 * @author JOFIEL BATISTA 14061213 
 */
public class EVA1_PRACTICA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS LA VARIABLES A UTILIZAR Y PEDIMOS LA CANTIDAD DE EDADES A UTILIZAR
        Scanner dato = new Scanner(System.in);
        double media = 0, dEstandar = 0;
        int moda;
        System.out.println("¿Cuantas edades ingresaremos?");
        int tArray = dato.nextInt();
        //CREAMOS 1 ARRAY DE LAS EDADES
        int edades[] = new int[tArray];
        //LLENAMOS EL ARRAY CON EDADES Y CALCULAMOS LA MEDIA
        for (int i = 0, j; i < tArray; i++) {
            System.out.println("Ingresa una edad:");
            j = dato.nextInt();
            edades[i] = j;
            media += j;
        }
        media = (double) (media / tArray);
        //CALCULAMOS LA MODA
        moda = edades[0];
        int actual;
        int cActual = 0;
        int cMayor = 0;
        for (int i = 0; i < tArray; i++) {
            actual = edades[i];
            for (int j = 0; j < tArray; j++) {
                if(actual == edades[j]){
                    cActual++;
                }
            }
            if(cActual > cMayor){
                cMayor = cActual;
                moda = edades[i];
            }
            cActual = 0;
        }
        //DESVIACION ESTANDAR
        for (int i = 0; i < tArray; i++) {
            dEstandar += Math.pow(edades[i]-media,2);
        }
        dEstandar = (double)(dEstandar/(tArray-1));
        dEstandar = (double) Math.sqrt(dEstandar);
        //IMPRIMIMOS RESILTADOS
        System.out.println("Media:" + media );
        System.out.println("Moda: " + moda);
        System.out.println("Frecuencia: " + cMayor);
        System.out.println("Desviacion Estandar: " + dEstandar);
    }
}
