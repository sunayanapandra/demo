package basics;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count =0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count =count+1;
			}
			if(count==2)
				System.out.println("prime number");
			else {
				System.out.println("not a prime number");
				
				
			}
		}
		
	}
	

}
