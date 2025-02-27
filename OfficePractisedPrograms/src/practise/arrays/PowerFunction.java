package practise.arrays;

import java.util.Scanner;

public class PowerFunction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base : ");
		double x = sc.nextDouble();
		
		System.out.println("enter exponentail");
		int n = sc.nextInt();
		
		System.out.println("pow of  "+x+"^"+n +" is "+pow(x, n));
		
		
	}

	private static double pow(double x, int n) {
		
		if(n==0 || n==1) {
			return x;
		}else if(n>0){
			return x*pow(x, n-1);
		}else {
			return 1/ pow(x, -n);
		}
	}

}
