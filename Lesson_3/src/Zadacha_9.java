import java.util.*;

/**
 * Created by Volodya on 19.01.2016.
 */

class Prost_chicl {
    int s1;
    boolean counter = false;
    int ret_chislo (int a) {
        for (int j = a/2+1 ; j > 1; --j){
            s1 = a%j;
            if (s1 == 0)	{
                counter = false;
                break;
            }
            else {
                counter = true;
            }
        }
        if (counter)	return a;
        else return -1;
    }
}

class Zadacha_9 {
    void met_9 () {
        Scanner sk9 = new Scanner(System.in);
        System.out.println("=== VVEDITE CHISLO =====");
        System.out.println("BUDUT VUVEDENO VSE PROSTUE CHISLA");
        int v = sk9.nextInt();

        ArrayList <Integer> arl = new ArrayList <Integer> ();
        int rez;
        System.out.println ();
        Prost_chicl pr = new Prost_chicl ();

        for	(int i=v; i>2; --i)	{
            rez = pr.ret_chislo (i);
            if (rez > 0) {
                arl.add (rez);
            }
        }
        arl.add (2);
        Integer mas [] = new Integer [arl.size()];
        mas = arl.toArray (mas);
        Arrays.sort (mas);
        System.out.println("PROSTUE CHISLA ");
        for (int d : mas)	System.out.print (d + " ");
        System.out.println();
    }
}
