import java.util.Scanner;

public class id {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user name");
        String name=sc.next();

        System.out.println("enter the password");
        int password=sc.nextInt();
        if(name.equals("admin")){
            if(password==1234){
                System.out.println("login Succesful");
            }else{
                System.out.println("wrong password");
            }
        }
        else{
            System.out.println("invaild username");
        }
    }
}
