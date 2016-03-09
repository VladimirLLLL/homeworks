/**
 * Created by Volodya on 08.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        ClassControl cc = new ClassControl();
        cc.personControl();
        cc.teacherControl();
        cc.studentControl();
        cc.collegeStudentControl();
        Person pr1 [] = cc.vuvod();

        for (Person pers : pr1){
        System.out.println(pers);
        }

    }
}
