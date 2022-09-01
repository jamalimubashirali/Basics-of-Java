abstract class Animal{
    Animal(){
        System.out.println("Hello Iam an Animal");
    }
    abstract void walk();
    public void eats(){
        System.out.println("Eat something");
    }
}

class Hourse extends Animal{
    Hourse(){
        System.out.println("Me Badal");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
       Hourse H= new Hourse();
       H.walk();
       H.eats();
       }
    }

