public class Question_1_3 {
//    Condition 2: no extra space / no libraries
    public static void main(String[] args) {
        int[] array = {3,-2,1,2,7};
        System.out.println("first missing integer : "+missingIntegerCon2(array));
    }
    static int missingIntegerCon2(int[] array){
        for(int i=0;i< array.length;i++){
            if(array[i]<=0){
                array[i] = array.length+2;
            }
        }
        for(int i=0;i< array.length;i++){
            int temp =array[i];
            if(array[i]<0){     //  for absolute value
                temp = -1 * array[i];
            }
            if(temp<= array.length && array[temp-1]>0){
                array[temp-1] = -1 * array[temp-1];
            }
        }
        for(int i=0;i< array.length;i++){
            if(array[i]>0){
                return i+1;
            }
        }
        return array.length+1;
    }
}
