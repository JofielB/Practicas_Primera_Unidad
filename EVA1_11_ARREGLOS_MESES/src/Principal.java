
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOFIEL  14061213
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreMeses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio"
                ,"Agosto","Septiembre","Octubre","Noviembre","Diciembre",};
        int diasMes[]={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner a = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 12:");
        int mes = a.nextInt();
        System.out.println("El mes es: " + nombreMeses[mes-1]+" tiene: " + diasMes[mes-1]+" dias");
    }
}
