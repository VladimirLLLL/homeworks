/**
 * Created by Volodya on 08.02.2016.
 */
public class ClassControl {
    Person [] persons = new Person[4];
   void  personControl (){
        Person person = new Person("VASA", 40, "M");
        System.out.println("Name person " + person.getName() + " " + person.getAge() + " let " + " pol " +  person.getDanger());
        person.setName("NINA");
        person.setAge(20);
        person.setDanger("V");
        System.out.println("New name person " + person.getName() + " " + person.getAge() + " let " + " pol " + person.getDanger() );
       persons [0] = person;
    }

    void teacherControl () {
        Teacher teacher = new Teacher("MAR VANOVNA", 77, "V", 10_000, "mathimetics");
        Teacher teacher1 = teacher.getTeacher(teacher);
        System.out.println("Teacher " + teacher1.name + " vozrastom " + teacher1.age + " sex " + teacher1.danger +
                " salary " + teacher1.salary + " subject " + teacher1.subject);
        Teacher teacher2 = new Teacher("IVAV IVANICH", 55, "M", 15_000, "chemikst");
        teacher.setTeacher(teacher2);

        teacher1 = teacher.getTeacher(teacher);
        System.out.println("NEW  Teacher " + teacher1.name + " vozrastom " + teacher1.age + " sex " + teacher1.danger +
                " salary " + teacher1.salary + " subject " + teacher1.subject);
        persons [1] = teacher;
    }

    void studentControl () {
        Student student = new Student("MISHA", 18, "M", "BYLDER", 3.7);
        System.out.println("Student name " + student.getName() + " " + student.getAge() + " let " +
                " pol " + student.getDanger() + " spesial " + student.getIdNumber() + " ser_ball " + student.getGpa());
        student.setName("NATASHA");
        student.setAge(55);
        student.setDanger("V");
        student.setIdNumber("nurse");
        student.setGpa(5.5);
        System.out.println("Student name " + student.getName() + " " + student.getAge() + " let " + " pol " + student.getDanger()
                + " spesial " + student.getIdNumber() + " ser_ball " + student.getGpa());
        persons [2] = student;
    }

    void collegeStudentControl () {
        CollegeStudent colstud = new CollegeStudent("PETA", 16, "M", "driver", 3.3, 1, "AAAAA");
        System.out.println("Student name " + colstud.getName() + " " + colstud.getAge() + " let " + " pol " + colstud.getDanger()
                + " spesial " + colstud.getIdNumber() + " ser_ball " + colstud.getGpa() + " v colege " + colstud.getYear() +
        " shesial " + colstud.getMajor());
        colstud.setGpa(4.4);
        colstud.setIdNumber("seller");
        colstud.setDanger("M");
        colstud.setAge(17);
        colstud.setMajor("BBBBB");
        colstud.setYear(2);
        colstud.setName("VITALIJ");
        System.out.println("Student name " + colstud.getName() + " " + colstud.getAge() + " let " + " pol " + colstud.getDanger()
                + " spesial " + colstud.getIdNumber() + " ser_ball " + colstud.getGpa() + " v colege " + colstud.getYear() +
                " shesial " + colstud.getMajor());
        persons [3] = colstud;
    }

    Person [] vuvod () {
      return persons;
    }
}


