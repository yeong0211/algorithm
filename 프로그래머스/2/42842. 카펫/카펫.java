class Solution {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = {0,0};
        
        for(int i=1;i<=yellow;i++){
            if(yellow%i!=0) continue;
            if(2*i + 2*(yellow/i) + 4 == brown){
                answer[1] = i+2;
                answer[0] = yellow/i+2;
                break;
            }
        }
        
        return answer;
    }
}