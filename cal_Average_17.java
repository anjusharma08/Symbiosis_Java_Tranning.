import java.util.Scanner;
public class cal_Average_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter how many elements you want: ");
     int n=sc.nextInt();
     
     int[] arr=new int[n];
     System.out.println("Enter array elements:  ");
     int sum=0;
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
    	 sum+=arr[i];
     }
     System.out.println("Average is : "+sum/n);
	}
}