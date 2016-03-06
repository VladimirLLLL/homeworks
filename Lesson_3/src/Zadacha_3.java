/**
 * Created by Volodya on 18.01.2016.
 */
class Zadacha_3 {
    void met_3 () {
        int counter = 0;
        int a1, a2;
        String st1 = "";
        System.out.println("CHASTLIVUE BILETU");
        for (int i = 1000; i < 1_000_000; ++i){
            st1 = Integer.toString(i);
            if (st1.length() == 4) st1 = "00" + st1;
            else if (st1.length() == 5)st1 = "0" + st1;
            a1 = st1.charAt(0) +st1.charAt(1) + st1.charAt(2);
            a2 = st1.charAt(3) +st1.charAt(4) + st1.charAt(5);
            if (a1 == a2)++ counter;
        }
        System.out.println("CHASTVIVUX BILETOV ( ot 000_001 do 999_999 )== " + counter);
    }
}
