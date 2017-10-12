package eva1_practica_4;
/**
 *
 * @author JOFIEL 14061213
 */
public class EVA1_PRACTICA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*CREAMOS 3 ARRAYS
        DOS CON DATOS RANDOM
        Y OTRO CON LAS MULTIPLICACIONES
        DE LOS ANTERIORES*/
        double mUno[][] = new double[5][5];
        double mDos[][] = new double[5][5];
        double mulUD[][] = new double[5][5];
        /*LLENAMOS 2 ARRAY CON DATOS RANDOM
        Y LLENAMOS EL ARRAY CON LOS DATOS
        MULTIPLICADOS*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mUno[i][j] = (double) (Math.random() * 10) + 1;
                mDos[i][j] = (double) (Math.random() * 10) + 1;
                mulUD[i][j] = mUno[i][j] * mDos[i][j];
            }
        }
        //SE IMPRIME ARRAY 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + mUno[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        //SE IMPRIME ARRAY 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + mDos[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        //SE IMPRIME ARRAY MULTIPLICACIONES
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + mulUD[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
