/**
 * Created by Volodya on 19.01.2016.
 */

class Ret_el {
    private int counter =0;
    private int a = 0;
    int sum_rez (int d) {
        if (d==2) return counter;
        a = sum_rez (d-1)+ (d-2);
        if (d-1 == 3) ++ counter;
        else if (d==3) ++ counter;
        return counter;
    }
}

public class Zadacha_8 {
    void met_8 (){
        int el_4 =3;
        Ret_el rr = new Ret_el();
        int rez = rr.sum_rez(15);
        System.out.println(" 4 element vuchituvalsa " + rez + " raz(a");
    }
}




