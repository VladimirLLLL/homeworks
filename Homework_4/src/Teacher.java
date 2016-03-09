/**
 * Created by Volodya on 08.02.2016.
 */
public class Teacher extends Person {
    double salary;
    String subject;
    Teacher (String name, int age, String danger, double salary, String subject){
        super(name,age, danger);
        this.salary = salary;
        this.subject = subject;
    }

    void setTeacher (Teacher t){
        this.name = t.name;
        this.age = t.age;
        this.danger = t.danger;
        this.salary = t.salary;
        this.subject = t.subject;

    }

     Teacher getTeacher (Teacher t){
        return t;
    }

    void tostring (Teacher t) {
        System.out.println(t);
        System.out.println("Teacher " + t.name + " vozrastom " + t.age + " sex " + t.danger + " salary " + t.salary
                + " subject " + t.subject);
    }


}
