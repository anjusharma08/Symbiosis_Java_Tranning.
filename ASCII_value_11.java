import java.util.Scanner;
public class ASCII_value_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter the Character: ");
		ch=sc.next().charAt(0);
		
		int a=ch;
		System.out.println("ASCII value of " + ch + " is " + a);
	}

}
