
//function overloading ; compile time; different parameter , no of arguement , different datatypes
//function overriding ; run time
class Student{

    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);

    }
    public void printInfo(int age){
        System.out.println(age);

    }
    public void printInfo(String name ,int age){
        System.out.println(name);
        System.out.println(age);

    }
}

public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name="yash";
       s1.age= 21;
       s1.printInfo(s1.age);

    }
}