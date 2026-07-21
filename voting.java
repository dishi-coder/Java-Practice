import java.util.Scanner;
public class voting {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your Age");
    int age=sc.nextInt();

    if(age>=18){
        System.out.println("voter is  eligible");
    }else{
        System.out.println("voter is not eligible");
    }
  }   
}
