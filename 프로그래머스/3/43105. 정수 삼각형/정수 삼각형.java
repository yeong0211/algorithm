class Solution {
    public int solution(int[][] triangle) {
        
        int [][] arr = new int [triangle.length][triangle.length];
        
        arr[0][0] = triangle[0][0];
        for(int i=1;i<triangle.length;i++){
            for(int j=0;j<=i;j++){
            	if(j>0) arr[i][j] = triangle[i][j]+Math.max(arr[i-1][j], arr[i-1][j-1]); 
            	else arr[i][j] = triangle[i][j]+arr[i-1][j];
            }
        }
        
        int max = 0;
        for(int i=0;i<triangle.length;i++){
            max = Math.max(max, arr[triangle.length-1][i]);
        }
        
        return max;
    }
}