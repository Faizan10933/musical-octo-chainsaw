package fzn;

import java.util.Scanner;

public class RSA {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a prime number");
		int p=sc.nextInt();
		System.out.println("enter another prime number");
		int q=sc.nextInt();
		int n=p*q;
		int e=0;
		int d=0;
		int phi=(p-1)*(q-1);
		for(int i=2;i<phi;i++) {
			if(gcd(i,phi)==1) {
				if(i==3)
					continue;
				else
				{
					e=i;
					break;
				}
				
			}
		}
		System.out.println("value of e: "+e);
		for(int k=1;;k++) {
			if(((k*e)%phi)==1) {
				d=k;
				break;
			}
		}
		
		System.out.println("value of d: "+d);
		System.out.println("public key: "+"{"+e+","+n+"}");
		System.out.println("private key: "+"{"+d+","+n+"}");
		
	}
	public static int gcd(int a, int b) {
		if(b==0)
		return a;
		else
			return gcd(b,a%b);
	}
	

}
