import java.util.Scanner;
public class Circumference_of_circle_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi=3.14,Circumference;
		int radius;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		radius =sc.nextInt();
		
		Circumference=2*pi*radius;
		System.out.println("Circumference of circle is : "+Circumference);
		
		
	}

}
