
/*
EN ESTE PROYECTO SE CRERAN 2 CLASES CON SUS METODOS
PARA ASI TENER UNA MEJOR VISION DE COMO FUNCIONA 
EL STATIC 
 *
 * @author 14061213
 */
public class Principal {

    /**
     * SE MUESTRA LA DIFERENCIA ENTRE UN METODO
     * NO ESTATICO Y UN METODO ESTATICO
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaNoEstatic prueba = new PruebaNoEstatic();
        prueba.imprimirMensaje();
        System.out.println(prueba.nombre);
        PruebaEstatica.imprimirMensaje();
    }
    
}
/*Clase con metodo no estatico*/
class PruebaNoEstatic{
    public String nombre = "Melquiades";
    /*METODO NO ESTATICO DE LA CLASE
    IMPRIME UN MENSAJE*/
    public void imprimirMensaje(){
        System.out.println("Hola");
    }
}
/*Clase con metodo estatico*/
class PruebaEstatica{
    public static String nombre = "Melquiades";
    /*METODO ESTATICO DE LA CLASE
    IMPRIME UN MENSAJE*/
    public static void imprimirMensaje(){
        System.out.println("Hola");
    }
}