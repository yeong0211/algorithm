import java.util.*;

class Main {
	
	static int [][] arr;
	static int countWhite = 0;
	static int countBlue = 0;
	
	public static void main(String[] args) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		count(0, 0, n);
		System.out.println(countWhite);
		System.out.println(countBlue);
		
    }
	
	static void count(int x, int y, int n) {
		
		int start = arr[x][y];

		int check = 0;
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(arr[i][j] != start) check++;
			}
		}
		
		if(check==0) {
			if(start == 0) countWhite++;
			else countBlue++;
			return;
		}
	
		count(x, y, n/2);
		count(x+(n/2), y, n/2);
		count(x, y+(n/2), n/2);
		count(x+(n/2), y+(n/2), n/2);
		
	}
}