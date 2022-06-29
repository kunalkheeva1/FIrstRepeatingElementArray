import java.util.HashMap;

public class FirstRepeatingElementArray {
    public static int firstRepeatingElementArray(int [] arr, int n){
        int mi = Integer.MAX_VALUE;
        boolean rep = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                rep = true;
                mi = Math.min(mi, map.get(arr[i]));
            }
            else{
                map.put(arr[i], i+1);
            }
        }
        if(rep == false){
            return -1;
        }
        else return mi;
    }
    public static void main(String[] args) {

    }
}
