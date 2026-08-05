public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 5, 30, 30, 15};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        boolean foundSecond= false;//first we have to set the second value 
        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
                foundSecond= true;

                // these condtion for the duplication value
            }else if(arr[i]<largest && arr[i] >secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println("It is the second Largest Element  " + secondlargest);
        System.out.println("It is first Element  " + largest);
    }
}
