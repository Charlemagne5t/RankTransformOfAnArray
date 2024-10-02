import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        Map<Integer, Integer> map = new HashMap<>();
        int shift = 0;
        for(int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                shift++;
            }else {
                map.put(arr2[i],  i - shift + 1);
            }
        
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}