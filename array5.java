public class array5 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 7, 8, 13};
        int evenCount=0;
        int oddCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            evenCount++;
            }else{
                oddCount++;
            }
            
        }
        System.out.println("even"+ evenCount);
              System.out.println("odd"+ oddCount);
    }
}
