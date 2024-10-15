import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int count = commands.length;
        List<Integer> list = new ArrayList<>();
        
        for(int[] arr : commands){
            int[] cut = Arrays.copyOfRange(array, arr[0]-1,arr[1]);
            Arrays.sort(cut);
            list.add(cut[arr[2]-1]);
        }
        
        int[] answer = new int[count];
        for(int i=0;i<count;i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}