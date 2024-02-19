public class Question_2 {
//    given n array elements, find max subarray sum
    public static void main(String[] args) {
        int[] array = {-1, 4, 6, 8, -10, 2, 7};
        System.out.println("max subarray sum : "+maxSubarraySum(array));
    }
    static int maxSubarraySum(int[] array){
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(sum < 0){
                sum = 0;
            }
            sum = sum + array[i];
            max_sum = Math.max(sum,max_sum);
        }
        return max_sum;
    }
}
