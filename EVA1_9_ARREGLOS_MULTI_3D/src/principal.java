/*SEGUNDA PRACTICA MANEJANDO
ARRAYS DE MULTIPLES DIMENSIONES
EN ESTA CASO UN ARRAY 3D*/

/**
 *
 * @author JOFIEL 14061213
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo3D[][][] = new int[2][2][2];
        //LLENAMOS EL ARRAY 3D CON VALORES ALEATORIOS
        for (int i = 0; i < 2; i++) {//FILAS
            for (int j = 0; j < 2; j++) {//COLUMNAS
                for (int k = 0; k < 2; k++) {//NIVELES
                    arreglo3D[i][j][k] = (int) (Math.random()*100)+1;
                }
            }
        }
        //IMPRIMIMOS EL ARRAY 3D
        for (int i = 0; i < 2; i++) {//FILAS
            for (int j = 0; j < 2; j++) {//COLUMNAS
                for (int k = 0; k < 2; k++) {//NIVELES
                    System.out.println("["+arreglo3D[i][j][k]+"]");
                }
            }
        }
        
    }
    
}
