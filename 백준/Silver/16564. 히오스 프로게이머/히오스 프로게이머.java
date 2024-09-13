import java.io.*;
import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 캐릭터의 개수
    	int k = sc.nextInt(); 	// 올릴 수 있는 레벨 총합
    	
    	int [] arr = new int [n];
    	for(int i=0;i<n;i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	int min = arr[0], max = arr[0]+k;
    	
    	while(min<=max) {
    		int mid = (min+max)/2;
    		long sum = 0;
    		for(int i=0;i<n;i++) {
    			if(mid>arr[i]) sum+=mid-arr[i];
    			if(sum>k) break;
    		}
    		
    		if(sum>k) max = mid-1; 
    		else min = mid+1;
    	}
    	
    	System.out.println(min-1);
    }
}