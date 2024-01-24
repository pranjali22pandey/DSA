
class Student{
    String name;
     static String school;
     public static void changeSchool(){
         school = "newschool";
     }
}

public class Main {
    public static void main(String[] args) {
      Student.school="jps"; // can be accessed without new object since it is useable by all
      Student std1 = new Student();
      std1.name ="tony";
        System.out.println(std1.school); // will remain same for all wheather std1 or std2

    }
}