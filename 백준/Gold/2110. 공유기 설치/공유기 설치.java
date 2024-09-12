import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 집의 개수
    	int c = sc.nextInt();	// 공유기의 개수
    	
    	int [] arr = new int[n];	// 집의 좌표
    	for(int i=0;i<n;i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);		// 이진탐색을 위한 정렬
    	
    	int max = arr[n-1]-arr[0]+1, min = 1, mid = 0;
    	
    	while(min<max) {
    		mid = (min+max)/2;
    		
    		int sum = 1;
    		int house = arr[0];		// 마지막으로 공유기를 설치한 위치와 비교
    		for(int i=1;i<n;i++) {
    			if(arr[i]-house>=mid) {
    				sum++;
    				house = arr[i];
    			}
    		}
    		
    		if(sum<c) max = mid;
    		else min = mid+1;
    	}
    	
    	System.out.println(min-1);	// sum==c일 때가 아닌 sum < c일떄 멈추기 때문에 -1
    }
}