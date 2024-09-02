import java.util.Scanner;
public class Stusent_grade_12 {
	
	public static void grade() {
		int roll_no,age,HTML,CSS,PHP,JAVA,PYTHON;
		String name;
		double Total_marks,percentage;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----STUDENT DETAILS----- ");
		System.out.println("Enter the Student roll no: ");
		roll_no=sc.nextInt();
		
		System.out.println("Enter the Student Name: ");
		name=sc.next();
		
		System.out.println("Enter the Student age: ");
		age=sc.nextInt();
		
		System.out.println("-----STUDENT MARKS DETAILS-----");
		
		System.out.println("Enter the HTML marks: ");
		HTML=sc.nextInt();
		System.out.println("Enter the CSS marks: ");
		CSS=sc.nextInt();
		System.out.println("Enter the PHP marks: ");
		PHP=sc.nextInt();
		System.out.println("Enter the JAVA marks: ");
		JAVA=sc.nextInt();
		System.out.println("Enter the PYTHON Marks: ");
		PYTHON=sc.nextInt();
		
		Total_marks=HTML+CSS+PHP+JAVA+PYTHON;
		System.out.println("TOTAL MARKS OF STUDENT IS: "+Total_marks);
		percentage=Total_marks/500*100;
		System.out.println("PERCENTAGE:  "+percentage+"%");
		
		if(percentage>80) {
		System.out.println("GRADE Is: A");
		}
		else if(percentage>60) {
			System.out.println("GRADE Is: B");
		}
		else if(percentage>40) {
			System.out.println("GRADE Is: C");
		}
		else{
			System.out.println("GRADE Is: D");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade();
		
		}
		
	}
