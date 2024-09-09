import java.util.*;

class Main {
	
	static int n, m, max, min, mid;
	static int [] tree;
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();	// 나무의 수
    	m = sc.nextInt();	// 필요한 나무의 길이
    	
    	tree = new int[n];	// 나무의 높이
    	
    	tree[0] = sc.nextInt();
    	max = tree[0];
    	min = tree[0];
    	
    	for(int i=1;i<n;i++) {
    		tree[i] = sc.nextInt();
    		max = max>tree[i] ? max : tree[i]; 
    		min = min<tree[i] ? min : tree[i];
    	}
    	
    	if(n==1) System.out.println(tree[0]-m);
    	
    	else if(max==min) {
    		if(m%n==0) System.out.println(tree[0]-(m/n));
    		else System.out.println(tree[0]-(m/n)-1);
    	}
    	
    	else {
    		while(min<max) {
    			long sum = 0;
    			mid = (max+min)/2;
    			
    			for(int i=0;i<n;i++) {
    	    		sum += (tree[i]-mid>0 ? tree[i]-mid : 0);
    	    	}
    			
    			if(sum>=m) min = mid+1;
    			else max = mid;
    		}
    		System.out.println(min-1);
    	}
    }
}