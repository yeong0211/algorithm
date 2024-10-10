class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        
        int min = 1;
        int max = 100000;
        int mid = 0;
        long total = 0;
        while(max>min){
            total = 0;
            mid = (min+max)/2;
            
            for(int i=0;i<diffs.length;i++){
                
                if(mid<diffs[i]){
                    if(i==0) total += (diffs[i]-mid+1)*times[i];
                    else{
                        total += (times[i]+times[i-1])*(diffs[i]-mid);
                        total += times[i];
                    }
                }else { total += times[i]; }
                
            }
            
            if(limit >= total){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        
        return min;
    }
}