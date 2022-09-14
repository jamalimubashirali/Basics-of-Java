interface Calculator{
    void add(int a,int b);
    void subtract(int a,int b);
    void multiply(int a,int b);
    void divide(int a,int b);

}

public class AnonymousInnerClass {
    public static void main(String[] args){
      Calculator c= new Calculator() {
          @Override
          public void add(int a, int b) {
              System.out.println(a+b);
          }

          @Override
          public void subtract(int a, int b) {
              System.out.println(a-b);
          }

          @Override
          public void multiply(int a, int b) {
              System.out.println(a*b);
          }

          @Override
          public void divide(int a, int b) {
              System.out.println((float)(a/b));
          }

          public  void module(int a){
              if(a<0){
                  a*=(-1);
                  System.out.println(a);
              }else {
                  System.out.println(a);
              }
          }

          public void zeroFactorial(int a){
              if(a==0){
                  System.out.println("Factorial of "+a+" is 1");
              }else {
                  System.out.println("The number is not zero");
              }
          }
      };
      c.add(2,6);
      c.subtract(7,5);
      c.multiply(3,8);
      c.divide(6,4);

    }
}

