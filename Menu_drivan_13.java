import java.util.Scanner;
public class Menu_drivan_13 {
	int num1,num2,add,sub,multi;
	double divi,mod;
	Scanner sc=new Scanner(System.in);
	
	public void ADDITION() {
		
		System.out.println("Enter the frist number: ");
	    num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		add=num1+num2;
		System.out.println("Addition is num1+ and num2+: "+add);
	} 
	

	public void SUBTRACTIOJN() {
		System.out.println("Enter the frist number: ");
	    num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		sub=num1-num2;
		System.out.println("subtraction is: "+sub);
		
	} 
	

	public void MULTIPLICATION() {
		System.out.println("Enter the frist number: ");
	    num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		multi=num1*num2;
		System.out.println("multiplication is: "+multi);
	} 
	

	public void DIVISION() {
		System.out.println("Enter the frist number: ");
	    num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		divi=num1/num2;
		System.out.println("division is: "+divi);
	} 
	

	public void MODULE() {
		System.out.println("Enter the frist number: ");
	    num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		mod=num1%num2;
		System.out.println("module is: "+mod);
	} 

	public void show() {

	
		
		System.out.println("Choice Based mathematical operation");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTIOJN");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.MODULE");
		
		System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
			
			switch(choice) {
			case 1: ADDITION();
			break;
			
			case 2: SUBTRACTIOJN();
			break;
			
			case 3:MULTIPLICATION ();
			break;
			
			case 4: DIVISION();
			break;
			
			case 5: MODULE();
			break;
			
			default:
				System.out.println("Invalid choice");
			}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu_drivan_13 obj =new Menu_drivan_13();
		obj.show();
	}

}
