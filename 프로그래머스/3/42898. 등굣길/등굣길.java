class Solution {
    public int solution(int m, int n, int[][] puddles) {
        
        boolean [][] skip = new boolean [n+1][m+1];
        int [][] arr = new int [n+1][m+1];
        for(int i=0;i<puddles.length;i++){
            skip[puddles[i][1]][puddles[i][0]] = true;
        }
        
        arr[1][1] = 1;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(skip[i][j]) arr[i][j] = 0;
                else{
                    if(i>1) arr[i][j] += arr[i-1][j];
                    if(j>1) arr[i][j] += arr[i][j-1];
                    arr[i][j]%=1000000007;
                }
            }
        }
        
        return arr[n][m];
    }
}