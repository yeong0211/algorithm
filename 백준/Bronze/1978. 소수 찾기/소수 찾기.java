import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int answer = 0;
			for(int i=0;i<n;i++) {
				if(is_Prime(Integer.parseInt(st.nextToken()))==true) answer++;
			}
			System.out.println(answer);
	}
	
	static boolean is_Prime(int a) {	
		if(a==1) return false;
		
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) return false;
		}
		
		return true;
	}
}