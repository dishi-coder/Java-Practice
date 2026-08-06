class laesec{
    public static void main(String[] args){
        int[] arr={12,33,4,44,54,5,5};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];

            }
        }
        System.out.println(largest );
        System.out.println(smallest);
    }
}