class Pen{
   String color;
   String type;

   public void write(){
       System.out.println("writing something");
   }
   public void printColor(){
       System.out.println(this.color);

   }

}

class Student{

    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("non parameterised ");
    }

    Student(String name , int age){
        System.out.println(" parameterised ");
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        System.out.println(" copy ");
        this.name = s2.name;
        this.age = s2.age;
    }


}

public class Main{
    public static void main(String[ ] args){

        Pen pen1= new Pen();
        pen1.color = "blue";
        pen1.type ="gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color="black";
        pen2.printColor();


        Student s1 = new Student();//constructor
        s1.name = "raj";
        s1.age = 24;
        s1.printInfo();


        // parameterised
        Student s1 = new Student("aman",24);
        s1.printInfo();


        //copy
        s1.name = "raj";
        s1.age = 24;
        Student s2 = new Student(s2);
        s1.printInfo();

    }


}
