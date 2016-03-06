/**
 * Created by Volodya on 18.01.2016.
 */
import java.util.Scanner;

class zadacha_4 {
    void met_4 () {
        String st_h = "";
        String st_min = "";
        int h1, h2, min1, min2;
        int counter = 0;

        for (int h=0; h<24; ++h){
            for (int min=0; min<60; ++ min){
                if (h<10) st_h = "0" + Integer.toString(h);
                else st_h = Integer.toString(h);
                if (min < 10)st_min = "0" + Integer.toString(min);
                else st_min = Integer.toString(min);
                    h1 = Character.getNumericValue(st_h.charAt(0));
                    h2 = Character.getNumericValue(st_h.charAt(1));
                    min1 = Character.getNumericValue(st_min.charAt(0));
                    min2 = Character.getNumericValue(st_min.charAt(1));
                if ((h1==min1 || h1==min2) && (h2==min1 || h2==min2)) ++ counter;
            }
        }
        System.out.println("SIMETRICHESKAA KOMBINACIA v elektronnux chasax ==  " + counter);
    }
}
