import java.util.*;
import java.io.*;

class Main {
	
	public static void main(String[] args) throws Exception	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [][] arr = new String [20][2];
		
		double answer = 0;
		double count = 0;
		
		for(int i=0;i<20;i++) {;
			String temp = br.readLine();
			StringTokenizer st = new StringTokenizer(temp);
			st.nextToken();
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		for(int i=0;i<20;i++) {
			double score = Double.parseDouble(arr[i][0]);
			String grade = arr[i][1];
			if(grade.equals("P")) continue;
			else if(grade.equals("A+")) answer += score*(4.5);
			else if(grade.equals("A0")) answer += score*(4);
			else if(grade.equals("B+")) answer += score*(3.5);
			else if(grade.equals("B0")) answer += score*(3);
			else if(grade.equals("C+")) answer += score*(2.5);
			else if(grade.equals("C0")) answer += score*(2);
			else if(grade.equals("D+")) answer += score*(1.5);
			else if(grade.equals("D0")) answer += score;
			
			count+= score;
		}
		System.out.println(answer/count);
		
    }
}