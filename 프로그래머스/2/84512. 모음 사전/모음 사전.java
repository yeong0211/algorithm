import java.util.*;

class Solution {
    
    static List<String> list;
    
    public int solution(String word) {
        
        list = new ArrayList<>();
        
        dfs("");
        
        return list.indexOf(word);
    }
    
    static void dfs(String str){
        if(str.length()>5) return;
        
        list.add(str);
        
        for(int i=0;i<5;i++){
            dfs(str+"AEIOU".charAt(i));
        }
    }
}