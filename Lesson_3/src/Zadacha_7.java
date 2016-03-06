import java.util.Scanner;

/**
 * Created by Volodya on 19.01.2016.
 */

class Ret_sum {
        int sum_rez (int d) {
        int sum;
        if (d==1) return 1;
        sum = sum_rez (d-1)+ d;
        return sum;
    }
}

public class Zadacha_7 {
    void met_7 (){
        System.out.println("VVEDITE TSELOE CHISLO ====");
        Scanner sk = new Scanner(System.in);
        int i = sk.nextInt();
        Ret_sum rr = new Ret_sum();
        int rez = rr.sum_rez(i);
        System.out.println("SUMMA CHISEL CHISLA " + i + " == " +rez);
    }
}
