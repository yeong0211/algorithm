import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        
        int[] answer = {0,0,0,0};
        Map <Integer, int[]> vertex = new HashMap<>();
        
        for(int[] edge : edges){
            if(!vertex.containsKey(edge[0])) vertex.put(edge[0],new int[]{0,0});
            if(!vertex.containsKey(edge[1])) vertex.put(edge[1],new int[]{0,0});
            vertex.get(edge[0])[0]++;
            vertex.get(edge[1])[1]++;
        }
        
        for(int key : vertex.keySet()){
            int [] node = vertex.get(key);
            
            //생성한 정점: 출발한 간선이 두 개 이상, 도착한 간선이 0
            if(node[0]>=2 && node[1]==0) answer[0] = key;
            
            //막대 모양 그래프의 리프 노드: 출발한 간선이 0, 도착한 간선이 한 개 이상
            else if(node[0]==0 && node[1]>0) answer[2]++;
            
            //8자 모양 그래프의 중심 노드: 출발한 간선이 두 개, 도착한 간선이 두 개 이상
            else if(node[0]==2 && node[1]>=2) answer[3]++;
        }
        
        //도넛 모양 그래프: 생성한 정점의 개수(총 그래프의 개수) - 막대 모양/8자 모양 그래프의 개수
        answer[1] = vertex.get(answer[0])[0] - answer[2] - answer[3];
        
        return answer;
    }
}