import java.util.*;

class Main
{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		return n*factorial(n-1);
	}
}