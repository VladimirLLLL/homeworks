/**
 * Created by Volodya on 19.01.2016.
 */
public class Zadacha_5 {
    void met_5 () {
        System.out.println("COZDANIE I VUVOD ELEMENTOV MASSIVA");
        int mass [][] = new int [8][5];
        for (int i=0; i<8; ++i){
            for (int j=0; j<5; ++j){
                mass [i][j] = 10+ (int)(Math.random()*(89));
                System.out.println("ZNACHENIE " + i + " " + j + " == " + mass [i][j]);
            }
        }
    }
}
