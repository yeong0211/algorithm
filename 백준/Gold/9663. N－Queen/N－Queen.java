import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
	static int n;
	static int count = 0;
	static int [] arr;
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	
    	arr = new int[n];
    	
    	dfs(0);
    	
    	System.out.println(count);
    }
    
    static void dfs(int depth) {
    	if(depth == n) {
    		count++;
    		return;
    	}
    	
    	for(int i=0;i<n;i++) {
    		arr[depth] = i;
    		if(check(depth)) {
    			dfs(depth+1);
    		}
    	}
    }
    
    static boolean check(int position) {
    	
    	if(position == 0) return true;
    	
    	for(int i=0;i<position;i++) {
    		if(arr[i]==arr[position] || arr[i]+(position-i)==arr[position] || arr[i]-(position-i)==arr[position]) return false;	
    	}
    	return true;
    }
}