import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, List<int[]>> song = new HashMap<>();
        
        for(int i=0;i<genres.length;i++){
            if(map.containsKey(genres[i])) {
            	map.put(genres[i], map.get(genres[i])+plays[i]);
            	song.get(genres[i]).add(new int[] {i, plays[i]});
            }
            else {
            	map.put(genres[i], plays[i]);
            	List<int[]> temp = new ArrayList<>();
            	temp.add(new int[] {i, plays[i]});
            	song.put(genres[i], temp);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        int pos = 0;
        
        List<String> list_map = new ArrayList<>(map.keySet());
        Collections.sort(list_map, (o1,o2)->map.get(o2)-map.get(o1));
        
        for(String key:list_map){
            
            List<int[]> list = new ArrayList<>();
            
            for(HashMap.Entry<String, List<int[]>> e : song.entrySet()){
               if(e.getKey().equals(key)){
            	   list = e.getValue();
               }
            }
            
            Collections.sort(list, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return b[1]-a[1];
                }
            });
            
            ans.add(list.get(0)[0]);
            pos++;
            if(list.size()>1){
                ans.add(list.get(1)[0]);
                pos++;
            }
        }
        
        int [] answer = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}