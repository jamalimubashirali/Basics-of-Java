import java.util.*;
public class StringIntro {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        String j=new String("Jamali");
        String d=new String("MUbashir");
        System.out.println(d+j);
        char g=sc1.next().charAt(0);
        System.out.println(j);
        String a= "Saeed",e="Fared";
        if(a.compareTo(e)==0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        String str = new String ("123");
        int num= Integer.parseInt(str);
        System.out.println("String to Integer :"+num);
        int num2=386509830;
        String makeInteger= new String();
        makeInteger = Integer.toString(num2);
        System.out.println("Integer to String :"+makeInteger);
        String makeDouble=new String("0.9999");
        double catchString=Double.parseDouble(makeDouble);
        System.out.println("String to Double : "+catchString);
        double makeString=5787.609870989990000000000;
        String catchDouble= new String();
        catchDouble=Double.toString(makeString);
        System.out.println("Double to String :" +catchDouble);// Ways of making n String object
        byte b[]={'A','L','I'};
        char c[]={'A','h','s','a','n'};
        StringBuilder sb= new StringBuilder("Hassan");
        StringBuffer sBuilder = new StringBuffer("Fahad");
        char ch[]={'M','u','b','a','s','h','i','r','A','l','i'};


        String firstString =new String("Mubashir");
        String secondString=new String (b);
        String thirdString=new String(c);
        String forthString=new String(sb);
        String fifthString=new String(sBuilder);
       String sixString =new String(ch,8,1);
        System.out.println(firstString);  //Mubashir
        System.out.println(secondString); //1234
        System.out.println(thirdString); //Ahsan
        System.out.println(forthString); //Hassan
        System.out.println(fifthString);//Fahad
       System.out.println(sixString);//Ali
// Methods of String class
        String sc = "Ha Iam a Programmer";
        String me="Mubashir";
        String me2="mubashir";
        System.out.println(sc.charAt(7));
        System.out.println(sc.indexOf('a'));
        System.out.println(sc.indexOf("Iam"));
        System.out.println(me.equals(me2));
        System.out.println(me.equalsIgnoreCase(me2));
        System.out.println(me.compareTo(me2));
        System.out.println(me.compareToIgnoreCase(me2));
        System.out.println(me.concat(me2));
        System.out.println(me.replace('M','i'));
        System.out.println(sc.replaceAll("Iam","Ha"));
        String sub= sc.substring(3,6);
        System.out.println(sub);

































    }
}
