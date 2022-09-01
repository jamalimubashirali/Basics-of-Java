class Students{
    static String schoolName;
    String name;

    public static void  changeSchool(){
        schoolName="Degree College Larkana";
    }
}

public class Static {
    public static void main(String[] args) {
        Students.schoolName="Mpl";
        Students s1 =new Students();
        s1.name="Mubashir";
        System.out.println(s1.name);
        System.out.println(s1.schoolName);
        s1.changeSchool();
        System.out.println(s1.schoolName);
    }
}
