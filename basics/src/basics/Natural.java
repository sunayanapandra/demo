package basics; // pacakage
import java.util.Scanner; //import statement
public class Natural { // class
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner (System.in); //obj create for scanner class
int num,i, sum =0; // variable declare
System.out.println("sum from"); //print the sum
  i =sc.nextInt(); //
  System.out.println("sum upto");
  num = sc.nextInt();
  while (i<=num) {
	  sum = sum+i;
	  i++;
	  System.out.println("sum of natural numbers ="+sum);
  }

	}

}
