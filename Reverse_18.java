import java.util.Scanner;
public class Reverse_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter how many elements you want: ");
	     int n=sc.nextInt();
	     int [] Element=new int[n];
	     for(int i=0;i<n;i++) {
	    	 System.out.println("Enter array element: "+(i+1));
	    	 Element[i]=sc.nextInt();
	     }
	     System.out.println("\noriginal elements are: ");
	     for(int i=0;i<n;i++) {
	    	 System.out.println(Element[i]+" ");
	     }
	     System.out.println("\nreverse elements are: ");
	     for(int i=n-1;i>=0-1;i--) {
	    	 System.out.println(Element[i]+" ");
	     }
	}

}
