import java.util.Scanner;
public class Factorial_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int number,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number is : "+fact);
		}

}
