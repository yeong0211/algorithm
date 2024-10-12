import java.util.*;

class Solution {
    
    static Queue<int []> [] route; //로봇이 이동한 경로 저장
    static int routes_size;
    
    public int solution(int[][] points, int[][] routes) {
        
        routes_size = routes.length;
        route = new LinkedList[routes_size];
        for(int i=0;i<routes_size;i++){
            route[i] = new LinkedList<>();
        }
        
        make_route(points, routes);
        int answer = count_crash();
        return answer;
    }
    
    static void make_route(int[][] points, int[][] routes){
        for(int i=0;i<routes_size;i++){
            int start_point = routes[i][0]-1;
            
            int pos_x = points[start_point][0];
            int pos_y = points[start_point][1];
            
            route[i].add(new int[] {pos_x, pos_y});
            
            for(int j=0;j<routes[i].length-1;j++){
                int end_point = routes[i][j+1]-1;
                
                while(points[end_point][0]!=pos_x){
                    if(points[end_point][0]-pos_x>0) pos_x++;
                    else pos_x--;
                   route[i].add(new int[] {pos_x,pos_y});
                }
            
                while(points[end_point][1]!=pos_y){
                    if(points[end_point][1]-pos_y>0) pos_y++;
                    else pos_y--;
                    route[i].add(new int[] {pos_x,pos_y});
                }
            }
        }
    }
    
    static int count_crash(){
        int count = 0;
        int route_max_size = 0;
        for(int i=0;i<routes_size;i++){
            route_max_size = route[i].size()>route_max_size? route[i].size():route_max_size;
        }
        
        int [][] visited = new int [101][101];
        for(int i=0;i<101;i++) Arrays.fill(visited[i],0);
        for(int i=0;i<route_max_size;i++){
            for(int j=0;j<routes_size;j++){
                int [] temp = route[j].poll();
                if(temp != null) visited[temp[0]][temp[1]]++;
            }
            for(int j=0;j<101;j++){
                for(int k=0;k<101;k++){
                    if(visited[j][k]>1) count++;
                    visited[j][k]=0;
                }
            }
            
        }
        
        return count;
    }
}