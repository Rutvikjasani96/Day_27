import java.util.Arrays;

public class Question_1_2 {
//    Condition 1: you can not use any inbuilt libraries
    public static void main(String[] args) {
        int[] array = {3,-2,1,2,7};
        System.out.println("first missing integer : "+missingIntegerCon1(array));
    }
    static int missingIntegerCon1(int[] array){
        boolean[] check = new boolean[array.length];
        Arrays.fill(check,false);
        for(int i=0;i< array.length;i++){
            if(array[i]>0 && check.length>array[i]-1){
                check[array[i]-1] = true;
            }
        }
        for(int i=0;i< check.length;i++){
            if(!check[i]){ // check[i] == false
                return i+1;
            }
        }
        return array.length+1;
    }
}
