class Solution {
    public int solution(int[] wallet, int[] bill) {
        
        int temp = 0;
        int answer = 0;
        if(wallet[0] < wallet[1]){
            temp = wallet[0];
            wallet[0] = wallet[1];
            wallet[1] = temp;
        }
        if(bill[0] < bill[1]){
            temp = bill[0];
            bill[0] = bill[1];
            bill[1] = temp;
        }
        
        
        while(bill[0]>wallet[0] || bill[1]>wallet[1]){
            answer++;
            bill[0] /= 2;
            
            if(bill[0] < bill[1]){
                temp = bill[0];
                bill[0] = bill[1];
                bill[1] = temp;
            }
        }
        
        return answer;
    }
}