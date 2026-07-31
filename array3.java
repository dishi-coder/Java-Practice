public class array3 {
    public static void main(String[] args) {
        int[] arr={112,33,4,5,45};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
           
        }
         System.out.println(max);
    }
}
