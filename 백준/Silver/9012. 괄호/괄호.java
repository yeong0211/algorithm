import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] str = new String[n];
		for(int i=0;i<n;i++) str[i] = br.readLine();
    	
		String [] answer = new String[n];
		Stack<Integer> stack = new Stack<>();

		for(int i=0;i<n;i++) {
			stack.clear();
			
			for(char c : str[i].toCharArray()) {
				if(c==')' && stack.isEmpty()) answer[i]="NO"; 
				else if(c=='(') stack.add(0) ;
				else stack.pop();
			}
			if(answer[i]==null && stack.isEmpty()) answer[i] = "YES";
			else answer[i] = "NO";
		}
		
		for(String s:answer) System.out.println(s);
    }
}