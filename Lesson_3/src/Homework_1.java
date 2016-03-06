import java.util.Scanner;

/**
 * Created by Volodya on 18.01.2016.
 */
public class Homework_1 {
    public static void main(String[] args) {
        Scanner skan1 = new Scanner(System.in);
        do {
            System.out.println("++++++ VUBERITE zadanie (1-10) ++++++");
            System.out.println(" ========  VUXOD vvv ================");
            int i = skan1.nextInt();
            String str = skan1.toString();
            switch (i) {
                case 1:
                    System.out.println("VUPOLNAETSA ZADACHA 1");
                    System.out.println();
                    Zadacha_1 zd1 = new Zadacha_1();
                    zd1.met_1();
                    break;
                case  2:
                    System.out.println("VUPOLNAETSA ZADACHA 2");
                    System.out.println();
                    Zadacha_2 zd2 = new Zadacha_2();
                    zd2.met_2();
                    break;
                case 3:
                    System.out.println("VUPOLNAETSA ZADACHA 3");
                    System.out.println();
                    Zadacha_3 zd3 = new Zadacha_3();
                    zd3.met_3();
                    break;
                case 4:
                    System.out.println("VUPOLNAETSA ZADACHA 4");
                    System.out.println();
                    zadacha_4 zd4 = new zadacha_4();
                    zd4.met_4 ();
                    break;
                case 5:
                    System.out.println("VUPOLNAETSA ZADACHA 5");
                    System.out.println();
                    Zadacha_5 zd5 = new Zadacha_5();
                    zd5.met_5();
                    break;
                case 6:
                    System.out.println("VUPOLNAETSA ZADACHA 6");
                    System.out.println();
                    Zadacha_6 zd6 = new Zadacha_6();
                    zd6.met_6();
                    break;
                case 7:
                    System.out.println("VUPOLNAETSA ZADACHA 7");
                    System.out.println();
                    Zadacha_7 zd7 = new Zadacha_7();
                    zd7.met_7();
                    break;
                case 8:
                    System.out.println("VUPOLNAETSA ZADACHA 8");
                    System.out.println();
                    Zadacha_8 zd8 = new Zadacha_8();
                    zd8.met_8();
                    break;
                case 9:
                    System.out.println("VUPOLNAETSA ZADACHA 9");
                    System.out.println();
                    Zadacha_9 zd9 = new Zadacha_9();
                    zd9.met_9();
                    break;
                case 10:
                    System.out.println("VUPOLNAETSA ZADACHA 10");
                    System.out.println();
                    Zadacha_10 zd10 = new Zadacha_10();
                    zd10.met_10 ();
                    break;
                default:
                    System.out.println("!!!!!!! =====  NEVERNUJ VUBOR ====== !!!!!!!");

            }
            System.out.println();
            System.out.println("========= SDELAJTE BUBOR (1-10) =========== vvv - vuxod ===");
        } while (!skan1.hasNext ("ccc"));
    }
}
