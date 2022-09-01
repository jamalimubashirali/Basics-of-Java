interface Animals{
    void walk();
}

interface Herbivore{
    void eats();
}

class Hourses implements Animals,Herbivore{
    @Override
    public void walk() {
        System.out.println("Walks on four legs");
    }

    @Override
    public void eats() {
        System.out.println("Eats only Grass");
    }
}

public class Interface {
    public static void main(String[] args) {
        Hourses H=new Hourses();
        H.eats();
        H.walk();
    }
}
