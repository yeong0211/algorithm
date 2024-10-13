import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        
        Arrays.sort(times);
        
        long min = (long)times[0];
        long max = times[times.length-1]*(long)n;
        long mid = 0;
        long total = 0;
        long ans = max;
        while(min<max){
            total = 0;
            mid = (min+max)/2;
            for(int t : times){
                total += mid/t;
            }
            if(total>=n){
                if(ans>mid) ans = mid;
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
}