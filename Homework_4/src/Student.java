/**
 * Created by Volodya on 08.02.2016.
 */
public class Student extends Person {
    String idNumber;
    double gpa;
    Student (String name, int age, String danger,String idNumber, double gpa){
        super(name, age, danger);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    String getName (){
        return name;
    }
    int getAge () {
        return age;
    }
    String getDanger (){
        return  danger;
    }
    String getIdNumber (){
        return idNumber;
    }
    double getGpa (){
        return gpa;
    }

    void setName (String name1){
        name = name1;
    }
    void setAge (int age1){
        age = age1;
    }
    void setDanger (String danger1){
        danger = danger1;
    }
    void  setIdNumber (String idNumber1) {
        idNumber = idNumber1;
    }
    void setGpa (double gpa1) {
        gpa = gpa1;
    }

}
