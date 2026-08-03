import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        int[] arr={12,12,2,33,44,33,33,44,44,44,555,555};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }


        }
        System.out.println(count);
    }
}
