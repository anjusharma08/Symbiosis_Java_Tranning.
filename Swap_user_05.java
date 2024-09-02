import java.util.Scanner;
public class Swap_user_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value of a: ");
		 int a = sc.nextInt();
		
	    System.out.println("Enter a value of b: ");
	     int b = sc.nextInt();
	     
	    System.out.println("Before swapping: a = " + a + ", b = " + b);
	    
	    int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}