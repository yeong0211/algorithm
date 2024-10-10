import java.io.*;
import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        for(String str : commands){
            pos = time_check(pos,op_start,op_end);
            if(str.equals("prev")) { pos = time_count(pos, -10, video_len); }
            else if(str.equals("next")) { pos = time_count(pos, 10, video_len); }
        }
        
        pos = time_check(pos,op_start,op_end);
        
        return pos;
    }
    
    static String time_check(String pos, String op_start, String op_end){
        StringTokenizer st = new StringTokenizer(pos,":");
        int pos_time = Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(op_start,":");
        int op_start_time = Integer.parseInt(st2.nextToken())*60 + Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(op_end,":");
        int op_end_time = Integer.parseInt(st3.nextToken())*60 + Integer.parseInt(st3.nextToken());
        if(pos_time>=op_start_time && pos_time<op_end_time) pos = op_end;
        return pos;
    }
    
    static String time_count(String str, int time, String video_len){
        StringTokenizer st = new StringTokenizer(str,":");
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(video_len,":");
        int video_min = Integer.parseInt(st2.nextToken());
        int video_sec = Integer.parseInt(st2.nextToken());
        if(time>0){
            if(sec>49){
                min += 1;
                sec -= 50;
            }else{
                sec += 10;
            }
            
            if(min>video_min || (min==video_min && sec>video_sec)){
                min = video_min;
                sec = video_sec;
            }
        }else{
            if(min==0 && sec<10){
                sec = 0;
            } else if(sec<10){
                min -= 1;
                sec += 50;
            }else{
                sec -= 10;
            }
        }
        
        String ans = "";
        if(min<10) { ans+=("0"+min); }
        else { ans+=min; }
        ans+=":";
        if(sec<10) { ans+=("0"+sec); }
        else { ans+=sec; }
        return ans;
    }
}