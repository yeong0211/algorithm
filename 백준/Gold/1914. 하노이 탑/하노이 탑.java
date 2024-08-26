import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception	{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	BigInteger num = new BigInteger("1");
    	BigInteger num2 = new BigInteger("2");
    	for(int i=0;i<n;i++) {
    		num = num.multiply(num2);
    	}
    	System.out.println(num.subtract(new BigInteger("1")));
    	
    	if(n<=20) hanoi(n,1,3,2);
    }
    
    static public void hanoi(int n, int start, int end, int temp) {
    	
    	if(n==1) {
    		System.out.println(start+" "+end);
    		return;
    	}
    	
    	hanoi(n-1, start, temp, end);
    	
    	System.out.println(start+" "+end);
    	
    	hanoi(n-1, temp, end, start);
    }
}