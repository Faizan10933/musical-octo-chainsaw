package blowfisbasa;
import javax.crypto.*;
import java.util.*;
public class blowfish 
{
	public static void main(String[] args) throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("blowfish");
		SecretKey secretKey = keyGenerator.generateKey();
		Cipher cipher = Cipher.getInstance("BLOWFISH");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tthe message: ");
		String inputText = sc.nextLine();
		byte[] encrypt = cipher.doFinal(inputText.getBytes());
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decrypt = cipher.doFinal(encrypt);
		System.out.println("The Encrypted message is : " + new String(encrypt));
		System.out.println("The Decrypted message is : " + new String(decrypt));
	}
}
