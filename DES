package fzn;
import java.util.Scanner;

import javax.crypto.*;

public class des {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter message");
			String plaintext= sc.nextLine();
			KeyGenerator kg=KeyGenerator.getInstance("DES");
			SecretKey mydeskey=kg.generateKey();
			
			Cipher c=Cipher.getInstance("DES");
			byte[]text = plaintext.getBytes();
			System.out.println("text in bytes: "+text);
			System.out.println("text is: "+ new String(text));
			c.init(Cipher.ENCRYPT_MODE,mydeskey);
			byte[] textenc = c.doFinal(text);
			System.out.println("Enc txt in bytes: "+ textenc);
			System.out.println("Enc text: "+new String(textenc));
			c.init(Cipher.DECRYPT_MODE,mydeskey);
			byte[] textdec = c.doFinal(textenc);
			System.out.println("Dec text in bytes: "+textdec);
			System.out.println("Dec text: "+ new String(textdec));
			
		}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}


