import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		System.out.println(mul(a,b,c));
    }
	
	static long mul(long a, long b, long c) {
		if(b==1)return a%c;
		
		long num = mul(a,b/2,c);
		if(b%2==0) return num*num%c;
		else return a*(num*num%c)%c;
	}
}