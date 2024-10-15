import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);
        int count = citations.length;
        int ans = 0;
        
        for(int i=0;i<count;i++){
            int hIndex = count - i;
            if(citations[i]>=hIndex){
                ans = hIndex;
                break;
            }
        }
        
        return ans;
    }
}