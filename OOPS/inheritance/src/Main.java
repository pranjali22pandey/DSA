
public Shape{
    public void area(){
        System.out.println("displays area");
        }
}


class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(1/2*l*h);    //single
    }
}

class equiTriangle extends Triangle{
    public void area(int l , int h){
        System.out.println(1/2*l*h);    //multilevel
    }
}

class circle extends Shape{
    public void area(int r ){
        System.out.println(3.14*r*r);    //herichal
    }
}
//hybrid
//no multiple only inheritance
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}