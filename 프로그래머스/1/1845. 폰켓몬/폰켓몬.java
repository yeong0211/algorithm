import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums) {
            if(map.containsKey(a)) map.put(a, map.get(a)+1);
            else map.put(a,1);
        }
        
        int len = nums.length;
        
        int num = 1;
        int total = 0;
        while(num<=len){
            int count = 0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()==num) count++;
            }
            
            total += count;
            if(total>=(len/2)) return total==len/2?total:len/2;
            num++;
        }
        
        return total;
    }
}