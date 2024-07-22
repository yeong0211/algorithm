import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		// Collections.sort() : List가 메모리 사용이 크다 -> 메모리 초과
		Arrays.sort(arr);
		
		for(int i : arr) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}