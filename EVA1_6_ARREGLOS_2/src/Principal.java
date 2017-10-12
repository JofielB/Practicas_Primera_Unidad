
import java.util.Scanner;

/* JUGAREMOS CON LOS ARRAY PARA VER COMO SE ALMACENAN
LOS DATOS 
 */

/**
 *
 * @author JOFIEL 14061213
 */
public class Principal {
    public final static int TAMA = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombres[] = new String[5]; 
        //CAPTURAMOS 5 NOMBRES
        Scanner a = new Scanner(System.in);
        for (int i = 0; i<nombres.length;i++) {
            System.out.println("Ingresa un nombre: ");
            nombres[i] = a.nextLine();
        }
        //IMPRIMIMOS LOS 5 NOMBRES
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
        //CREAR UNA COPIA DEL ARREGLO DE LA MANERA INCORRECTA
        String arregloCopia[] = nombres;
        nombres[0]= "Prueba";
        System.out.println("Copia: " + arregloCopia[0]);
        //CREAR UNA COPIA DE LA MANERA CORRECTA
        String copiaReal[] = new String[TAMA];
        for(int i = 0; i<copiaReal.length;i++){
            copiaReal[i] = nombres[i];
        }
        //COMPROBAMOS QUE SE CREO OTRO ARRAY 
        System.out.println("nombre original: " + nombres[0] );
        System.out.println("nombre copia real: " + copiaReal[0]);
        copiaReal[0] = "listo";
        System.out.println("nombre original: " + nombres[0] );
        System.out.println("nombre copia real: " + copiaReal[0]);
        
    }
}
