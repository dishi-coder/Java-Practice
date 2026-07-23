import java.util.Scanner;

public class age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the age");
        int umar=sc.nextInt();

        System.out.println("enter the citizenship");
        int citisez=sc.nextInt();

        if(umar>18){
            if(citisez==1){
                System.out.println("Eligible to voe");
            }else{
                System.out.println("Not Eligible");
            }
           
        }else{
            System.out.println("not Eligible");
        }

    }
}
