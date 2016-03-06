import java.util.Scanner;

/**
 * Created by Volodya on 18.01.2016.
 */

class Zadacha_1 {
    void met_1() {
        Scanner sk = new Scanner(System.in);
        System.out.println("VVEDITE chislo (vuchet summa chifr)");
        int a = sk.nextInt();
        String strr = Integer.toString(a);;
        int sum =0;
        char c;
        for (int i=0; i< strr.length(); ++i){
            c = strr.charAt(i);
            sum = sum + Character.getNumericValue(c);
        }
        System.out.println( "SUMMA THIFR CHISLA " + strr + " RAVNA " + sum);

    }
}
