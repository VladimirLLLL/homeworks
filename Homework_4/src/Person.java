/**
 * Created by Volodya on 08.02.2016.
 */
public class Person {
    String name, danger;
    int age;
    Person (String name, int age, String danger) {
        this.name = name;
        this.age = age;
        this.danger = danger;
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

    void setName (String name1){
        this.name = name1;
    }
    void setAge (int age1){
        this.age = age1;
    }
    void setDanger (String danger1){
        this.danger = danger1;
    }

}
