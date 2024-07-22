import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		// 입력 범위로 인한 시간 초과 방지 위해 Collections.sort() 사용
		// Collections.sort() : Timsort Algorithm 방식
		Collections.sort(list);
		
		for(int i : list) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}