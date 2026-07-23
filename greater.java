import java.util.Scanner;
class greater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int firstNumber=sc.nextInt();

        Scanner second=new Scanner(System.in);
        System.out.println("enter the second numberr");
        int secondNumber=second.nextInt();


        if(firstNumber>=secondNumber){
            System.out.println("first number is greater");
        }else{
            System.out.println("second number is greater");
        }

    }
}