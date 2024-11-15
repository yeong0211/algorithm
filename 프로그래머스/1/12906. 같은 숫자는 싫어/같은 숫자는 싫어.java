import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(arr[0]);
        
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp!=arr[i]){
                temp = arr[i];
                q.add(temp);
            }
        }
        
        int n = q.size();
        int [] ans = new int [n];
        for(int i=0;i<n;i++){
            ans[i] = q.poll();
        }

        return ans;
    }
}