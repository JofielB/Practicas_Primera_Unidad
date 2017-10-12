
import java.util.Scanner;

/*PRACTICA PARA DESCRIBIR LOS TIPOS DE DATOS PRMITIVOS
DEL LEMGUAJE JAVA

AUTOR 14061213
*/

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double salario;
        Scanner capturaDato = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        nombre = capturaDato.nextLine();
        System.out.println("Cual es tu edad?");
        edad = capturaDato.nextInt();
        System.out.println("Cual es tu salario?");
        salario = capturaDato.nextDouble();
        
        hacerAlgo(nombre,edad,salario); 
        
    }
   
    
    /**
     * Un metodo para imprimir los valores del usuario
     * @param nombre  Nombre del usuario
     * @param edad    Edad del usuario
     * @param salario Salario del usuario
     */
    public static void hacerAlgo(String nombre, int edad, double salario){
        System.out.println(nombre + " "  + edad  + " " + salario);
    }
    
}
