package code;

public class SumforEachSubArray {
    public static void main(String[] args) {
        int[] arr = {56,43,23,69,3};
        subarrayFunction(arr,arr.length);
    }
    public static void subarrayFunction(int[] arr,int length){
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print("Sum is : "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
}
