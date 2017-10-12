/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jofiel 14061213
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iVal = 10;
        System.out.println("iVal: " + iVal);
        //CREAR UNA COPIA
        int iCopiaVal = iVal;
        System.out.println("iCopiaVal: " + iCopiaVal);
        //INCREMENTAMOS iVal
        iVal++;
        //IMPRIMIMOS AMBOS Y COMPROBAMOS EL FUNCIONAMIENTO
        System.out.println("iVal: " + iVal);
        System.out.println("iCopiaVal: " + iCopiaVal);
        ////---
        Datos objDato = new Datos();
        System.out.println("objDato.iVal: "+ objDato.iVal);
        //DUPLICADO DE OBJETO QUE NO FUNCIONA
        Datos copiaDato = objDato;
        //COMPROBAMOS EL FUNCIONAMIENTO
        System.out.println("objDato.iVal: " + objDato.iVal);
        System.out.println("copiaDato.iVal: " + copiaDato.iVal);
        objDato.iVal++;
        System.out.println("copiaDato.iVal: " + copiaDato.iVal);
        System.out.println("objDato.iVal: " + objDato.iVal);
        //DUPLICADO DE OBJETO QUE SI FUNCIONA
        Datos copiaReal = new Datos();
        copiaReal.iVal = objDato.iVal;
        //COMPROBAMOS
        System.out.println("objDato.iVal: " + objDato.iVal);
        System.out.println("copiaReal.iVal: " + copiaReal.iVal);
        copiaReal.iVal++;
        System.out.println("objDato.iVal: " + objDato.iVal);
        System.out.println("copiaReal.iVal: " + copiaReal.iVal);
        System.out.println(objDato);
        System.out.println(copiaDato);
        System.out.println(copiaReal);
    }
    
    
}
class Datos{
    public int iVal = 8;
}
