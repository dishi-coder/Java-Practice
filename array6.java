import java.util.Scanner;

public class array6{
    public static void main(String[] args) {
        int[] arr={12,33,44,55,6,60};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        boolean found=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                found=true;
                
                break;
            }
            
        }

        if(found){
                System.out.println("Found");
            }else{
                System.out.println("not Found");
            }
    }
    
}