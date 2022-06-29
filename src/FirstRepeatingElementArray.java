import java.util.HashMap;

public class FirstRepeatingElementArray {

    public static int firstRepeatingElementArray(int [] arr, int n){

        //get the largest index first
        int mi = Integer.MAX_VALUE;
        boolean rep = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            //if map contains my element then get the index which is minimum
            if(map.containsKey(arr[i])){
                rep = true;
                mi = Math.min(mi, map.get(arr[i]));
            }//if not update its postion
            else{
                map.put(arr[i], i+1);
            }
        }
        //return false if there is no repetition
        if(rep == false){
            return -1;
        }
        else return mi;
    }
    public static void main(String[] args) {

    }
}
