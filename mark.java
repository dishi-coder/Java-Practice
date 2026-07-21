import java.util.Scanner;
public class mark {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
       System.out.println("enter the Marks of the student");
       int mark=sc.nextInt();

       if(mark >= 40){
        System.out.println("the student is pass");
       }else{
        System.out.println("the student is fail");
       }
    }
}
