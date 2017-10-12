/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_5;

import java.util.Scanner;

/**
 *
 * @author JOFIEL BATISTA 14061213
 */
public class EVA1_PRACTICA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS MATRIZ QUE ALMACENARA LOS DATOS
        double datosChihuahua[][] = new double[10][13];
        Scanner dato = new Scanner(System.in);
        //TEMOERATURA ALTA RECORD
        datosChihuahua[0][0] = 30.0;
        datosChihuahua[0][1] = 32.0;
        datosChihuahua[0][2] = 34.0;
        datosChihuahua[0][3] = 38.8;
        datosChihuahua[0][4] = 39.6;
        datosChihuahua[0][5] = 41.4;
        datosChihuahua[0][6] = 41.6;
        datosChihuahua[0][7] = 39.2;
        datosChihuahua[0][8] = 39.0;
        datosChihuahua[0][9] = 35.0;
        datosChihuahua[0][10] = 34.6;
        datosChihuahua[0][11] = 29.0;
        datosChihuahua[0][12] = 41.6;
        //TEMOERATURA ALTA PROMEDIO
        datosChihuahua[1][0] = 18.1;
        datosChihuahua[1][1] = 21.2;
        datosChihuahua[1][2] = 24.2;
        datosChihuahua[1][3] = 27.9;
        datosChihuahua[1][4] = 32.2;
        datosChihuahua[1][5] = 34.0;
        datosChihuahua[1][6] = 32.1;
        datosChihuahua[1][7] = 30.3;
        datosChihuahua[1][8] = 29.2;
        datosChihuahua[1][9] = 26.8;
        datosChihuahua[1][10] = 21.9;
        datosChihuahua[1][11] = 18.2;
        datosChihuahua[1][12] = 26.3;
        //TEMOERATURA MEDIA DIARIA
        datosChihuahua[2][0] = 10.0;
        datosChihuahua[2][1] = 12.9;
        datosChihuahua[2][2] = 15.7;
        datosChihuahua[2][3] = 19.2;
        datosChihuahua[2][4] = 23.6;
        datosChihuahua[2][5] = 26.3;
        datosChihuahua[2][6] = 25.6;
        datosChihuahua[2][7] = 24.3;
        datosChihuahua[2][8] = 22.6;
        datosChihuahua[2][9] = 18.7;
        datosChihuahua[2][10] = 13.7;
        datosChihuahua[2][11] = 10.3;
        datosChihuahua[2][12] = 18.6;
        //TEMOERATURA BAJA PROMEDIO
        datosChihuahua[3][0] = 2.0;
        datosChihuahua[3][1] = 4.5;
        datosChihuahua[3][2] = 7.1;
        datosChihuahua[3][3] = 10.4;
        datosChihuahua[3][4] = 14.9;
        datosChihuahua[3][5] = 18.6;
        datosChihuahua[3][6] = 19.1;
        datosChihuahua[3][7] = 18.2;
        datosChihuahua[3][8] = 16.0;
        datosChihuahua[3][9] = 10.7;
        datosChihuahua[3][10] = 5.5;
        datosChihuahua[3][11] = 2.4;
        datosChihuahua[3][12] = 10.8;
        //TEMOERATURA BAJA RECORD
        datosChihuahua[4][0] = -12.8;
        datosChihuahua[4][1] = -18.0;
        datosChihuahua[4][2] = -5.8;
        datosChihuahua[4][3] = -3.4;
        datosChihuahua[4][4] = 3.8;
        datosChihuahua[4][5] = 6.1;
        datosChihuahua[4][6] = 10.6;
        datosChihuahua[4][7] = 10.0;
        datosChihuahua[4][8] = 3.7;
        datosChihuahua[4][9] = -2.4;
        datosChihuahua[4][10] = -6.1;
        datosChihuahua[4][11] = -11.5;
        datosChihuahua[4][12] = -18.0;
        //PRECIPITACION PROMEDIO EN mm
        datosChihuahua[5][0] = 9.9;
        datosChihuahua[5][1] = 3.7;
        datosChihuahua[5][2] = 7.7;
        datosChihuahua[5][3] = 12.9;
        datosChihuahua[5][4] = 26.1;
        datosChihuahua[5][5] = 34.7;
        datosChihuahua[5][6] = 94.7;
        datosChihuahua[5][7] = 89.3;
        datosChihuahua[5][8] = 66.4;
        datosChihuahua[5][9] = 21.6;
        datosChihuahua[5][10] = 8.7;
        datosChihuahua[5][11] = 9.9;
        datosChihuahua[5][12] = 385.7;
        //PROMEDIO DE DIAS CON PRECIPITACION
        datosChihuahua[6][0] = 2.5;
        datosChihuahua[6][1] = 1.6;
        datosChihuahua[6][2] = 1.5;
        datosChihuahua[6][3] = 2.5;
        datosChihuahua[6][4] = 4.0;
        datosChihuahua[6][5] = 6.7;
        datosChihuahua[6][6] = 11.4;
        datosChihuahua[6][7] = 12.0;
        datosChihuahua[6][8] = 8.0;
        datosChihuahua[6][9] = 4.0;
        datosChihuahua[6][10] = 2.0;
        datosChihuahua[6][11] = 2.3;
        datosChihuahua[6][12] = 58.4;
        //PROMEDIO DE DIAS CON NIEVE
        datosChihuahua[7][0] = 0.30;
        datosChihuahua[7][1] = 0.18;
        datosChihuahua[7][2] = 0.09;
        datosChihuahua[7][3] = 0.09;
        datosChihuahua[7][4] = 0.00;
        datosChihuahua[7][5] = 0.00;
        datosChihuahua[7][6] = 0.00;
        datosChihuahua[7][7] = 0.00;
        datosChihuahua[7][8] = 0.00;
        datosChihuahua[7][9] = 0.00;
        datosChihuahua[7][10] = 0.50;
        datosChihuahua[7][11] = 0.88;
        datosChihuahua[7][12] = 2.04;
        //PROMEDIO DE HUMEDAD RELATIVA%
        datosChihuahua[8][0] = 55;
        datosChihuahua[8][1] = 49;
        datosChihuahua[8][2] = 39;
        datosChihuahua[8][3] = 37;
        datosChihuahua[8][4] = 37;
        datosChihuahua[8][5] = 42;
        datosChihuahua[8][6] = 53;
        datosChihuahua[8][7] = 61;
        datosChihuahua[8][8] = 61;
        datosChihuahua[8][9] = 56;
        datosChihuahua[8][10] = 55;
        datosChihuahua[8][11] = 57;
        datosChihuahua[8][12] = 50;
        //PROMEDIO DE HORAS MESUALES DE SOL
        datosChihuahua[9][0] = 185;
        datosChihuahua[9][1] = 204;
        datosChihuahua[9][2] = 254;
        datosChihuahua[9][3] = 278;
        datosChihuahua[9][4] = 299;
        datosChihuahua[9][5] = 273;
        datosChihuahua[9][6] = 240;
        datosChihuahua[9][7] = 242;
        datosChihuahua[9][8] = 229;
        datosChihuahua[9][9] = 238;
        datosChihuahua[9][10] = 191;
        datosChihuahua[9][11] = 174;
        datosChihuahua[9][12] = 2807;

        int p, s;
        final String[] datos = {"Temperatura Alta Record","Temperatura Alta Promedio",
            "Temperatura Media Diaria","Temperatura Baja Promedio","Temperatura Baja Record",
            "Precipitacion Promedio","Dias Con Precipitacion Promedio","Dias Con Nieve Promedio"
                ,"Promedio de Humedad Relativa(%)","Promedio de Horas Mensuales de Sol"};
        final String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio"
            ,"Julio","Agosto","Septiembre","Octumbre","Noviembre","Diciembre"};
        System.out.println("Chihuauha, Chihuhua");
        System.out.println("");
        System.out.println("¿Que informacions deceas saber?");
        System.out.println("Temperatura Alta Record[0]");
        System.out.println("Temperatura Alta Promedio[1]");
        System.out.println("Temperatura Media Diaria[2]");
        System.out.println("Temperatura Baja Promedio[3]");
        System.out.println("Temperatura Baja Record[4]");
        System.out.println("Precipitacion Promedio[5]");
        System.out.println("Dias Con Precipitacion Promedio[6]");
        System.out.println("Dias Con Nieve Promedio[7]");
        System.out.println("Promedio de Humedad Relativa(%)[8]");
        System.out.println("Promedio de Horas Mensuales de Sol[9]");

        p = dato.nextInt();
        System.out.println("¿Verificar del mes(1) o del Año(2)?");
        if (dato.nextInt() == 1) {
            System.out.println("¿De Que Mes?(1-12)");
            s = dato.nextInt();
            System.out.println(meses[s]+":");
            System.out.print(datos[p]+ ": ");
            System.out.println(datosChihuahua[p][s - 1]);
        } else {
            System.out.println("Año");
            System.out.print(datos[p]+": ");
            System.out.println(datosChihuahua[p][12]);
        }

    }
}
