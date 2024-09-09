import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	int k = sc.nextInt();	// 가지고 있는 랜선의 개수
    	int n = sc.nextInt();	// 필요한 랜선의 개수
    	
    	int [] arr = new int[k];	// 가지고 있는 랜선의 길이
    	long max = 0, min = 0;
    	for(int i=0;i<k;i++) {
    		arr[i] = sc.nextInt();
    		max = arr[i]>max ? arr[i] : max;
    	}
    	
    	long mid = 0;
    	max++;
    	while(min<max) {
    		mid = (min+max)/2;
    		long sum = 0;
    		for(int x : arr) {
    			sum += x/mid;
    		}
    		
    		if(sum<n) max = mid;
    		else min = mid+1;
    	}
    	
    	System.out.println(min-1);
    	
    }
}