class A{
    int a;

    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
}

class B extends A{
    int a;

    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
}

class C extends A{
    int a;

    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
}

public class ChekingInheritace {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    a.setA(4);
    b.setA(5);
    c.setA(6);
        System.out.println(a.getA());
        System.out.println(b.getA());
        System.out.println(c.getA());
    }
}
