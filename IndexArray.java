import java.util.Scanner;

public class IndexArray {
    public static void main(String[] args) {
        int[] arr={224,4,56,77,88};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index what you went");
        int n=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("index" + i);
                found=true;
            break;
                 }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
