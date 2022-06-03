BLOWFISH

import javax.crypto.*;

import java.util.*;

public class blowfish {

public static void main(String[] args) throws Exception {

KeyGenerator keyGenerator = KeyGenerator.getInstance("BLOWFISH");

SecretKey secretKey = keyGenerator.generateKey();

Cipher cipher = Cipher.getInstance("BLOWFISH");

cipher.init(Cipher.ENCRYPT_MODE, secretKey);

Scanner sc = new Scanner(System.in);

System.out.print("Enter the words want you to Encrypt : ");

String inputText = sc.nextLine();

byte[] encrypt = cipher.doFinal(inputText.getBytes());

cipher.init(Cipher.DECRYPT_MODE, secretKey);

byte[] decrypt = cipher.doFinal(encrypt);

System.out.println("Words After Encryption : " + new String(encrypt));

System.out.println("Words After Decryption : " + new String(decrypt));

}

}
