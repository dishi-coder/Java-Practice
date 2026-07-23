import java.util.Scanner;
public class threeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

     System.out.println("Enter the first number");
     int firstNumber=sc.nextInt();

     System.out.println("enter the second");
     int secondNumber=sc.nextInt();

     System.out.println("enter the third number");
     int thirdNumber=sc.nextInt();

     if(firstNumber>secondNumber  && firstNumber> thirdNumber){
        System.out.println("first is the greatest number");
     }else if(secondNumber>firstNumber && secondNumber >thirdNumber){
        System.out.println("second number is grestest");

     }else
     {
        System.out.println("third is the greated number in all");
     }
    }
}
