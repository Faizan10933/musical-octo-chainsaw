import java.math.BigInteger;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
//import javax.crypto.KeyGenerator;
public class aes {
	public static void main(String args[])throws Exception{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a msg");
		String message = sc.nextLine();
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		kg.init(128);
		SecretKey sk = kg.generateKey();
		byte[] raw= sk.getEncoded();
		SecretKeySpec sks = new SecretKeySpec(raw,"AES");
		Cipher c = Cipher.getInstance("AES");
		c.init(Cipher.ENCRYPT_MODE, sks);
		byte[] encrypt = c.doFinal(message.getBytes());
		System.out.println("enc text: "+ new String(encrypt));
		System.out.println("enc hex text: "+ bytehex(encrypt));
		c.init(Cipher.DECRYPT_MODE,sks);
		byte[] decrypt = c.doFinal(encrypt);
		System.out.println("dec text: " + new String(decrypt));
		
		
	}
	public static String bytehex(byte[] b)
	{
		BigInteger no = new BigInteger(1,b);
		String hashtext = no.toString(16);
		return hashtext;
	}

}
