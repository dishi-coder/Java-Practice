import java.util.Scanner;

public class even {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int n=sc.nextInt();

         for(int i=2;i<=100;i=i+2){
           if(i%2==0){
            System.out.println(i);
           }
         }
    }
}
