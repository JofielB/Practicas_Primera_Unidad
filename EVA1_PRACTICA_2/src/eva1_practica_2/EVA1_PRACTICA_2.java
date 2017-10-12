package eva1_practica_2;
/*
*@author JOFIEL BATISTA 14061213
*/
public class EVA1_PRACTICA_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[][] =new int[10][10];
        arreglo[0][0]=1;
        arreglo[1][1]=1;
        arreglo[2][2]=1;
        arreglo[3][3]=1;
        arreglo[4][4]=1;
        arreglo[5][5]=1;
        arreglo[6][6]=1;
        arreglo[7][7]=1;
        arreglo[8][8]=1;
        arreglo[9][9]=1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+arreglo[i][j]+"]");
            }
            System.out.println("");
        }
    }
}