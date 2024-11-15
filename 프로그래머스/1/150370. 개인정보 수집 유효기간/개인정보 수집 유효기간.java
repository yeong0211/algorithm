import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String ans = "";
        for(int i=0;i<privacies.length;i++){
            StringTokenizer st = new StringTokenizer(privacies[i]);
            StringTokenizer st1 = new StringTokenizer(st.nextToken(),".");
            int year = Integer.parseInt(st1.nextToken());
            int month = Integer.parseInt(st1.nextToken());
            int day = Integer.parseInt(st1.nextToken());
            String t = st.nextToken();
            int tMonth = 0;
            
            for(int j=0;j<terms.length;j++){
                StringTokenizer st2 = new StringTokenizer(terms[j]);
                if(st2.nextToken().equals(t)) month += Integer.parseInt(st2.nextToken());
            }
            
            if(month>12){
                year+=(month/12);
                if(month%12==0){
                    month = 12;
                    year--;
                } else month = (month%12);
            }
            
            System.out.println(year+" "+month+" "+day);
            StringTokenizer st3 = new StringTokenizer(today,".");
            int today_year = Integer.parseInt(st3.nextToken());
            int today_month = Integer.parseInt(st3.nextToken());
            int today_day = Integer.parseInt(st3.nextToken());
            if(today_year>year){
                ans+=(i+" ");
            }
            else if(today_year>=year && today_month>month) {
                ans+=(i+" ");
            }
            else if(today_year>=year && today_month>=month && today_day>=day) {
                ans+=(i+" ");
            }
        }
        
        StringTokenizer st4 = new StringTokenizer(ans);
        int [] answer = new int[st4.countTokens()];
        for(int i=0; i<answer.length;i++){
            answer[i] = Integer.parseInt(st4.nextToken())+1;
        }
        return answer;
    }
}
