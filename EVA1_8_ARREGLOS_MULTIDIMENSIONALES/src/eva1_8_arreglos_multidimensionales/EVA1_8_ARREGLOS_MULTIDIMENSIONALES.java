/*PRIMER PRACTICA DE ARREGLOS
MULTIDIMENSIONALES*/
package eva1_8_arreglos_multidimensionales;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA1_8_ARREGLOS_MULTIDIMENSIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array2D[][]= new int[3][3];
        //LLENAR DE NUMEROS ALEATORIOS
        for(int i = 0; i<3;i++){//FILAS
            for (int j = 0; j < 3; j++) {//COLUMNAS
                array2D[i][j]=(int)(Math.random()*10)+ 1;
            }
        }
        //IMPRIMIR VALORES
        for(int i = 0; i<3;i++){//FILAS
            for (int j = 0; j < 3; j++) {//COLUMNAS
                System.out.print("["+array2D[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
