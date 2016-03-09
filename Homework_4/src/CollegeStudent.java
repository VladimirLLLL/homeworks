/**
 * Created by Volodya on 08.02.2016.
 */
public class CollegeStudent extends Student {
    int year;
    String major;
    CollegeStudent (String name, int age, String danger,String idNumber, double gpa,int year, String major){
        super(name, age, danger, idNumber,gpa);
        this.year = year;
        this.major = major;
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
        return this.idNumber;
    }
    double getGpa (){
        return this.gpa;
    }
    int getYear () {
        return year;
    }
    String getMajor () {
        return major;
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
    void  setYear (int year1){
        year = year1;
    }
    void  setMajor (String major1) {
        major = major1;
    }
}
