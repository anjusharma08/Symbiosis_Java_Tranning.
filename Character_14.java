import java.util.Scanner;
public class Character_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		ch=sc.next().charAt(0);
		
		if(Character.isDigit(ch)) {
			System.out.println(ch + " is digit");
		}
		else if(Character.isLetter(ch)) {
			System.out.println(ch + " is Letter");
		}
		else {
			System.out.println(ch + " is special symbol");
		}
		
	}

}
