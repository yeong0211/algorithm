import java.util.*;

class Solution {
    public int solution(int N, int number) {
        
        Set<Integer> [] set = new Set[9];
        
        for(int i=1;i<9;i++){
            set[i] = new HashSet<Integer>();
            String temp = "";
            for(int j=0;j<i;j++){
                temp += Integer.toString(N);
            }
            set[i].add(Integer.parseInt(temp));
        }
        
        for(int i=1;i<9;i++){
            for(int j=1;j<i;j++){
                for(int a : set[j]){
                    for(int b : set[i-j]){
                        set[i].add(a+b);
                        set[i].add(a-b);
                        set[i].add(a*b);
                        if(b!=0) set[i].add(a/b);
                    }
                }
            }
            
            if(set[i].contains(number)) return i;
        }
        
        return -1;
    }
}