/**
 * Created by Volodya on 18.01.2016.
 */
class Zadacha_2 {
    void met_2 () {
        System.out.println("VUVOD 11 chltnov posledovatelnosti Fibonachi");
        int mas [] = new int [11];
        mas [0] = 1;
        mas [1] = 1;
        for (int i = 2; i<11; ++i){
            mas [i] = mas [i-1] + mas [i-2];
        }
        for (int s : mas) System.out.print (s + " ");
    }
}
