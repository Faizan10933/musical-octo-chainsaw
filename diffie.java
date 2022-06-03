package blowfish1.java;
import java.util.*; 
public class diffie {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of q");
		int q=sc.nextInt();
		System.out.println("Enter the value of alpha");
		int alpha=sc.nextInt();
		System.out.println("Enter the value of xA");
		int xA=sc.nextInt();
		System.out.println("Enter the value of xB");
		int xB=sc.nextInt();
		int yA=(int) (Math.pow(alpha, xA)%q);
		int yB=(int) (Math.pow(alpha, xB)%q);
		System.out.println("Enter the value of yA:"+ yA);
		System.out.println("Enter the value of yB:"+ yB);
		int KA=(int) (Math.pow(yB, xA)%q);
		int KB=(int) (Math.pow(yA, xB)%q);
		System.out.println("Enter the value of KA:"+ KA);
		System.out.println("Enter the value of KB:"+ KB);
		if(KA==KB){
			System.out.println("They can communicate with each other");}
			else {
				System.out.println("They cannot communicate with each other");
			}
		}
}
	

