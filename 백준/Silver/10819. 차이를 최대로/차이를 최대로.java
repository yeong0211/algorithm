import java.io.*;
import java.util.*;

class Main {
	static int n;
	static int [] arr;
	static int [] pattern;
	static boolean [] visited;
	static int sum;
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	arr = new int [n];			//주어진 입력 값을 저장하는 배열
    	pattern = new int [n];		//모든 경우의 수 임시 저장할 배열
    	visited = new boolean [n];
    	sum = 0;
    	for(int i=0;i<n;i++) {
    		arr[i] = sc.nextInt();
    	}
    	dfs(0);
    	System.out.println(sum);
    }
    
    public static void dfs(int cnt) {
    	//패턴 완성시 패턴의 합을 최댓값과 비교
    	if(cnt == n) {
    		int temp = 0;
    		for(int i=0;i<n-1;i++) {
    			temp+=Math.abs(pattern[i]-pattern[i+1]);
    		}
    		sum = Math.max(sum, temp);
    		return;
    	}
    	//패턴 만들기
    	for(int i=0;i<n;i++) {
    		if(!visited[i]) {
    			pattern[cnt] = arr[i];
    			visited[i] = true;
    			dfs(cnt+1);
    			visited[i] = false;
    		}
    	}
    }
}