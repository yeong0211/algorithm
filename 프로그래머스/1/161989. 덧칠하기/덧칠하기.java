class Solution {
    public int solution(int n, int m, int[] section) {
        
        int count = 0;
        int last_colored = -1;
        
        for(int pos : section){
            if(pos>last_colored) {
                count++;
                last_colored = pos+m-1;
            }
        }
        
        return count;
    }
}