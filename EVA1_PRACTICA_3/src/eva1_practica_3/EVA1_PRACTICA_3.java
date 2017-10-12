package eva1_practica_3;

/**
 *
 * @author JOFIEL 14061213
 */
public class EVA1_PRACTICA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS MATRIZ DE 5X5
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        //IMPTIMIMOS MATRIZ ORIGINAL
        System.out.println("Matriz Normal");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //CREAMOS MATRIZ INVERTIDA
        int matrizInversa[][] = new int[5][5];
        for (int i = 0, a = 4; i < 5; i++, a--) {
            for (int j = 0, b = 4; j < 5; j++, b--) {
                matrizInversa[i][j] = matriz[a][b];
            }
        }
        //IMPTIMIMOS MATRIZ INVERSA 
        System.out.println("Matriz Inversa");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matrizInversa[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
