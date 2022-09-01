class Shape{
    String color;
}
class Triangle extends Shape{
    float width;float height;
    public float area(float h,float w){
        height=h;
        width=w;
        float a=0.5f*height*width;
        return a;
    }
}

public class OOPS {
    public static void main(String[] args) {
       float b;
        Triangle t1= new Triangle();
       t1.color="Sky Blue";
       b= t1.area(3,9);
        System.out.println("THe area is :"+b);
    }
}
