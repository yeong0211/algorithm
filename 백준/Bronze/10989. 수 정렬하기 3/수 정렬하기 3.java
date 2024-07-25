import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException    {
    	
    	int [] counting = new int[10001];
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	
    	// Counting Sort
    	// 시간제한이 촉박하며, 입력되는 수의 범위가 제한적이므로(0 <= x <= 10,000) Counting Sort를 사용한다. 
        for(int i=0;i<n;i++) {
        	counting[Integer.parseInt(br.readLine())]++;
        }
        for(int i=1;i<10001;i++) {
        	while(counting[i]>0) {
        		sb.append(i).append('\n');
        		counting[i]--;
        	}
        }
        
    	System.out.println(sb);
    	br.close();
    }
}