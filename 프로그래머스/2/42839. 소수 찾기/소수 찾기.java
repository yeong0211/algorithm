import java.util.*;

class Solution {
    
    static char [] arr;
    static boolean [] visited;
    static HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        arr = numbers.toCharArray();
        visited = new boolean [numbers.length()];
        
        for(int i=1;i<=numbers.length();i++){
            dfs(numbers, "", i, 0);
        }
        
        return set.size();
    }
    
    static void dfs(String str, String temp, int index, int pos){
        if(index==pos){
            int num = Integer.parseInt(temp);
            if(isPrime(num)) set.add(num);
        }
        
        for(int i=0;i<str.length();i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str, temp+str.charAt(i), index, pos+1);
                visited[i] = false;
            }
        }
    }
    
    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
	    for(int i=2;i<=Math.sqrt(n);i++) {
		    if(n%i==0) return false;
	    }
	    
        return true;
    }
}