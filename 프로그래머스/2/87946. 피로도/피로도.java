class Solution {
    
    static boolean [] visited;
    static int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        
        dfs(dungeons, k, 0, 0);
        
        return max;
    }
    
    static void dfs(int[][] dungeons, int k, int pos, int count){
        if(dungeons.length == pos){
            max = max<count?count:max;
            return;
        }
        
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i]){
                visited[i] = true;
                if(k>=dungeons[i][0])
                    dfs(dungeons, k-dungeons[i][1], pos+1, count+1);
                else
                    dfs(dungeons, k, pos+1, count);
                visited[i]=false;
            }
        }
        
        return;
    }
}