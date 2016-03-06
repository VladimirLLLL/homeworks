/**
 * Created by Volodya on 19.01.2016.
 */
public class Zadacha_6 {
    void met_6 () {
        int mass [][] = new int [7][4];
        int mass1 [] = new int[7];
        int abss =0;
        for (int i=0; i<7; ++i){
            for (int j=0; j<4; ++j){
                mass [i][j] = -5 + (int)(Math.random()*(10));
                System.out.println("ZNACHENIE " + i + " " + j + " == " + mass [i][j]);
                abss = abss + Math.abs(mass [i][j]);
            }
            System.out.println("MODUL stroku " + i + " == " + abss);
            System.out.println();
            mass1 [i] = abss;
            abss = 0;
        }
            int d = mass1 [0];
            int counter =0;
        for (int i=1; i<7; ++i) {
            if (d < mass1 [i]){
                d = mass1 [i];
                ++ counter;
            }
        }
        System.out.println("INDEX naibolshej po modulu strori === " + counter + " stroka == " + d);
    }
}
