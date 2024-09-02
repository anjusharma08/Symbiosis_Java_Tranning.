public class Add_2D_mat_20 {
	public static void sumof2d() {
		int sum=0;
		
		int nums [][]=new int[3][5];
		
		for(int i=0;i<3;i++) 
			for (int j=0;j<5;j++)
			
				nums[i][j]=(i+1)*(j+1);
		
		System.out.println("print 2 d array ");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(nums[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumof2d();
	}
}