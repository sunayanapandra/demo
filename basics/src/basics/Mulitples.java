package basics;
import java.util.Scanner;
public class Mulitples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("the multiples of 3 and the multiples of 5");
		for(int num=0;num<=100;num++) {
			if(num%3==0 && num%5==0) {
				System.out.println("multiples by both numbers");
			}
				else if(num%3==0){
					System.out.println("multiplies by 3");
				}
					else if(num%5==0) {
						System.out.println("multiples of 5");
					}
						else {
							System.out.println(num);
						}
			
		}
	}
}
				
						
