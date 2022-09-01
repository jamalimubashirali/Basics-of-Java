import java.util.*;
public class CheckNumberPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        float num= sc.nextInt();
         float remider=0;
         while(num>1){
             remider=num%2;
             num/=2;
         }
         if(remider==0){
             System.out.println("The give nuber is power of 2");
         }
         else{
             System.out.println("The given number is not the power of 2");
         }
    }
}
