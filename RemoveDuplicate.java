public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 10, 40, 30};
      for(int i=0;i<arr.length;i++){
        boolean duplicate=false;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                duplicate=true;
                break;
            }
        }
        if(!duplicate){
            System.out.println(arr[i]);
        }
      }
    }

}
