package eva1_10_arreglos_multi_referencias;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA1_10_ARREGLOS_MULTI_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo3D[][][] = new int[5][3][8];
        System.out.println(arreglo3D.length);
        System.out.println(arreglo3D[0].length);
        System.out.println(arreglo3D[0][0].length);
        //SE LLENA EL ARRAY CON NUMEROS RANDOM
        for (int i = 0; i < arreglo3D.length; i++) {
            for (int j = 0; j < arreglo3D[i].length; j++) {
                for (int k = 0; k < arreglo3D[i][j].length; k++) {
                    arreglo3D[i][j][k] = (int) (Math.random()*100) + 1;
                }
            }
        }
        //SE IMPRIME EL ARRAY
        for (int i = 0; i < arreglo3D.length; i++) {
            for (int j = 0; j < arreglo3D[i].length; j++) {
                for (int k = 0; k < arreglo3D[i][j].length; k++) {
                    System.out.println("["+arreglo3D[i][j][k]+"]");
                }
            }
        }
        //FOR EACH
        for (int[][] ises : arreglo3D) {
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.println("["+i+"]");
                }
            }
        }
    }

}
