package cnslab;

import java.io.*;
import java.util.Scanner;

public class Hill {
	public static void main(String args[]) throws IOException
	{
	    int mes[][]=new int[1][2];
		int key[][]=new int[2][2];
	    int decrypt[][]=new int[1][2];
	    int encrypt[][]=new int[1][2];
		int ciph[][]=new int[1][2];
		int plain[][]=new int[1][2];
		int inv[][]=new int[2][2];
		
		
        try (Scanner sc = new Scanner(System.in)) {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 2*2 matrix:");
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					key[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter message:");
			String msg=br.readLine();
			int k=0;
			
			for(int i=0;i<msg.length();i++)
			{
				mes[0][i]=msg.charAt(k)-97;
				k++;
			}
		}
        
		encrypt_decrypt(mes,key,decrypt,ciph,inv,encrypt,plain);
    }
	
	public static void encrypt_decrypt(int mes[][],int key[][],int decrypt[][],int ciph[][],int inv[][],int encrypt[][],int plain[][])
	{
		for(int j=0;j<2;j++)
		{
			decrypt[0][j]=0;
			
			for(int k=0;k<2;k++)
			{
				decrypt[0][j]+=mes[0][k]*key[k][j];
			}
			
			ciph[0][j]=decrypt[0][j]%26;
			ciph[0][j]=ciph[0][j]+97;
		}
		System.out.println("Decrypted msg");
		for(int j=0;j<2;j++) {
			System.out.println ((char)ciph[0][j]);
		}
	inv[0][0]=key[1][1];
	inv[0][1]=-key[0][1];
	inv[1][0]=-key[1][0];
	inv[1][1]=key[0][0];
	int det=((key[0][0]*key[1][1])-(key[0][1]*key[1][0]));
	for(int j=0;j<2;j++)
	{
		encrypt[0][j]=0;
		for(int k=0;k<2;k++)
		{
			encrypt[0][j]+=decrypt[0][k]*inv[k][j];
		}
		plain[0][j]=((encrypt[0][j]/det)%26);
		plain[0][j]=plain[0][j]+97;
	}
	System.out.println("Encrypted msg");
		for(int i=0;i<2;i++)
		{
			System.out.println((char)plain[0][i]);
		}
}
}
