import java.util.Scanner;
public class Area_of_circle_01 {

		public static void circle() {
			
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int radius;
		double pi=3.14;
		System.out.println("Enter the radius of circle: ");
		radius=sc.nextInt();
		System.out.println("Area of circle is: "+radius*radius*3.14);
		
		}	
		
		public static void main(String[] args) {
			circle();
			}

}
