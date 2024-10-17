import java.util.*;

class Solution {
    
    static int count;   // 연결된 송전탑 개수
    static ArrayList<Integer>[] graph;
    static boolean [] visited;
    
    public int solution(int n, int[][] wires) {
        
        int answer = 100;
        
        for(int i=0;i<wires.length;i++){
            graph = new ArrayList[n+1];
            
            for(int j=0;j<n+1;j++){
                graph[j] = new ArrayList<>();
            }
            
            int pos = 0;
            for(int j=0;j<wires.length;j++){
                // 전선 끊기 : i번째 전선은 넘어가기
                if(i==j) continue;
                
                // 양방향 그래프
                graph[wires[j][0]].add(wires[j][1]);
                graph[wires[j][1]].add(wires[j][0]);
                pos = wires[j][0];
            }
            
            count = 1;
            visited = new boolean[n+1];
            dfs(pos);
            answer = Math.min(answer, Math.abs(2*count-n));
        }
        
        return answer;
    }
    
    static void dfs(int pos){
        visited[pos] = true;
        for(int i=0;i<graph[pos].size();i++){
            int next = graph[pos].get(i);
            if(visited[next]) continue;
            count++;
            dfs(next);
        }
    }
}