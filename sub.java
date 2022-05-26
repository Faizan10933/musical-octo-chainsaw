import java.io.*;
public class Ceaser {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String sub="qwertyuiopasdfghjklzxcvbnm";
		String encrypted = encrypt(str,alpha,sub);
		System.out.println("encrypted text is "+ encrypted );
		String decrypted= decrypt(encrypted,alpha,sub);
		System.out.println("decrypted text is "+ decrypted );

	}
	public static String encrypt(String str,String alpha, String sub) {
		String encrypted = "";
		char c;
		int j;
		for(int i=0;i<str.length();i++) {
			c= str.charAt(i);
			j=alpha.indexOf(c);
		    
			encrypted = encrypted+sub.charAt(j);
			}
			return encrypted;

		}
	public static String decrypt(String encrypt, String alpha, String sub) {

		String decrypted = "";
		char c;
		int j;
		for(int i=0;i<encrypt.length();i++) {
			c= encrypt.charAt(i);
			j=sub.indexOf(c);
			decrypted = decrypted+alpha.charAt(j);
			}
			return decrypted;
	}
	}
