import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    	int [] arr = new int[9];
    	int sum = 0;
    	int check=0;
    	for(int i=0;i<9;i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    		sum+=arr[i];
    	}
    	
    	for(int i=0;i<8;i++) {
    		if(check!=0) break;
    		for(int j=i+1;j<9;j++) {
    			if(sum-arr[i]-arr[j]==100) {
    				arr[i]=-1;
    				arr[j]=-1;
    				check++;
    				break;
    			}
    		}
    	}
    	
    	Arrays.sort(arr);
    	
    	for(int i=2;i<9;i++) {
    		System.out.println(arr[i]);
    	}
    }
}