import java.util.Scanner;
public class Area_of_Rectangle_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int L,B,Rectangle;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		L =sc.nextInt();
		
		System.out.println("Enter the Width: ");
		B =sc.nextInt();
		
		Rectangle=L*B;
		System.out.println("Area of Rectangle is : "+Rectangle);
		
	}
}
