import java.sql.SQLOutput;

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1= new Account();
        account1.name="Muet";
        account1.email="jamalimubashirali@gamil.com";
        account1.setPassword("jamali786");
        System.out.println(account1.getPassword());
        System.out.println("Task completed");
        System.out.println("Hello I am Back Again");
    }
}
