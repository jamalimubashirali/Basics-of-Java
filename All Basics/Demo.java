import java.util.*;
class students{

    String sName;
    Departments dept;
    students(String sName){
        this.sName=sName;
    }
    public void display(){
        System.out.println("Student name is "+sName);
        System.out.println("Department of student is "+dept.dName);
    }
}

class Departments{

    String dName;
    ArrayList<students> deptstudentslist= new ArrayList<students>();
    Departments(String dName){
        this.dName=dName;
    }
    void displayStudentsInDepartment(){
        for (int i=0; i<deptstudentslist.size();i++){
            System.out.println(deptstudentslist.get(i).sName);
        }
    }
 }


class University {

        String uniName;
        ArrayList<students> studentslist=new ArrayList<students>();
        ArrayList<Departments> deptlist=new ArrayList<Departments>();

        University(String uName,String[] sName,String[] dName){
            uniName=uName;
            for (int i=0;i<sName.length;i++)
                studentslist.add(new students(sName[i]));

            for(int i=0;i<dName.length;i++)
                deptlist.add(new Departments(dName[i]));
        }

        Departments getDepartment(String dName) {
            for (int i = 0; i < deptlist.size(); i++) {
                if (deptlist.get(i).dName.equals(dName))
                    return deptlist.get(i);
            }
            return null;
        }

    students getStudents(String sName) {
        for (int i = 0; i < studentslist.size(); i++) {
            if (studentslist.get(i).sName.equals(sName))
                return studentslist.get(i);
        }
        return null;
    }

}

public class Demo{
    public static void main(String[] args) {
        String snames[]={"hahhs","kskd"};
        String dname[]={"Me,Tl"};
        String uname="Muet";
        //University Muet=new University(uname,snames,dname);
        Departments d1= new Departments("Tl");
        students s1=new students("hahhs");
    }
}
