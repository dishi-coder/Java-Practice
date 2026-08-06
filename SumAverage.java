public class SumAverage {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50};
        int sum=0;
        double average=0;
        int averege=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            //number=total sum/numberssss of element
            average=(double)sum/arr.length;
            averege=sum/arr.length;
        }
             System.out.println("sum =" + sum);
             System.out.println("average =" +average);
             System.out.println(averege);

    }
}
