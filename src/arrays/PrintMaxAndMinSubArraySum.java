package arrays;

public class PrintMaxAndMinSubArraySum {
    public static void maxAndMinSubArraySum(int[] arr){
        int sum = 0, maxSum = Integer.MIN_VALUE,minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print("Sum : "+sum);
                if(sum>maxSum){
                    maxSum = sum;
                }
                if(sum<minSum){
                    minSum = sum;
                }
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MAX SUM : "+maxSum+"\nMIN SUM : "+minSum);
    }
    public static void main(String[] args) {
        int[] arr = {-1, 4, 6, 3, -2};
        maxAndMinSubArraySum(arr);
    }
}
