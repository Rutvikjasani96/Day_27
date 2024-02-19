import java.util.HashSet;

public class Question_1 {
//    Given n array elements, find first missing positive integer
    public static void main(String[] args) {
        int[] array = {3,-2,1,2,7};
        System.out.println("first missing integer : "+missingInteger(array));
    }
    static int missingInteger(int[] array){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i< array.length;i++){
            hs.add(array[i]);
        }
        for(int i=1;i<= array.length;i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return array.length+1;
    }
}
