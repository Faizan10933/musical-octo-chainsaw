import java.io.*;
public class Ceaser {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = encrypt(str,alpha);
		System.out.println("encrypted text is "+ encrypted );
		String decrypted= decrypt(encrypted,alpha);
		System.out.println("decrypted text is "+ decrypted );
		
	}
	public static String encrypt(String str,String alpha) {
		String encrypted = "";
		char c;
		int j;
		for(int i=0;i<str.length();i++) {
			c= str.charAt(i);
			j=alpha.indexOf(c);
			j=j+3;
			if(j>25) {
				j=j%26;
			}
			encrypted = encrypted+alpha.charAt(j);
			}
			return encrypted;
			
		}
	public static String decrypt(String encrypt, String alpha) {
		
		String decrypted = "";
		char c;
		int j;
		for(int i=0;i<encrypt.length();i++) {
			c= encrypt.charAt(i);
			j=alpha.indexOf(c);
			j=j-3;
			if(j<0) {
				j=26+j;
			}
			decrypted = decrypted+alpha.charAt(j);
			}
			return decrypted;
	}
	}


