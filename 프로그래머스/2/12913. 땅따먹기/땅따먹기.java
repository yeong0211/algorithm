class Solution {
    int solution(int[][] land) {
        
        int [] dp = land[0];
        
        for(int i=1;i<land.length;i++){
            int [] pos = new int [4];
            
            pos[0] = land[i][0] + Math.max(dp[1],Math.max(dp[2],dp[3]));
            pos[1] = land[i][1] + Math.max(dp[0],Math.max(dp[2],dp[3]));
            pos[2] = land[i][2] + Math.max(dp[0],Math.max(dp[1],dp[3]));
            pos[3] = land[i][3] + Math.max(dp[0],Math.max(dp[1],dp[2]));
            
            dp = pos;
        }

        int ans = 0;
        for(int i=0;i<4;i++){
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}