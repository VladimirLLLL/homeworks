import java.util.Scanner;

/**
 * Created by Volodya on 19.01.2016.
 */
class Zadacha_10_1 {
    void sterzen_resz (int count, char istochn, char tsel, char zapasnoj)	{

        if (count == 1) {
            System.out.println ("PEREMESTIT verxnee colso so sterzna " + istochn + " na sterzen " + tsel);
        }
        else	{
            sterzen_resz (count -1, istochn, zapasnoj, tsel);
            sterzen_resz (1, istochn, tsel, zapasnoj);
            sterzen_resz  (count -1, zapasnoj, tsel, istochn);
        }
    }
}

public class Zadacha_10 {
    void met_10 () {
        Scanner sk10 = new Scanner(System.in);
        System.out.println("UKAZITE KOLLICHESTVO KOLETZ");
        int i = sk10.nextInt();
        Zadacha_10_1 zd10_1 = new Zadacha_10_1 ();
        zd10_1.sterzen_resz  (i, 'A', 'B', 'C');
    }
}
