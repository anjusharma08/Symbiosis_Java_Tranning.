import java.util.Scanner;
public class Remainder_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
   
      int num1;
      int num2;
      int rem;
      
      System.out.println("Enter the frist number: ");
      num1=sc.nextInt();
      
      System.out.println("Enter the Second number: ");
      num2=sc.nextInt();
      
      rem=num1-(num1/num2)*num2;
      System.out.println("Remainder is : "+rem);
	}

}
