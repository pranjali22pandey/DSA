//method in interface is always public and declarations are always static
interface Animal {
    public void walk();
    int eys= 2;

}

interface Herbivore{

}
class Horse implements Animal, Herbivore //multiple {
    public void walk(){
        System.out.println(' walks on 4 legs');
    }
}

class Chicken implements Animal {
    public void walk(){
        System.out.println('walks on 2 legs');
    }
}



public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}