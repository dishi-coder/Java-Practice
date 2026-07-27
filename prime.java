import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        if(n<=1){
            boolean isPrime=true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                if(isPrime==false)
break;
      
            }

        }
    }
}
