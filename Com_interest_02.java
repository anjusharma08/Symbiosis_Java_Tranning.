

public class Com_interest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Formula A=P(1+r/n)n*t
	P=principal,r=rate,n=numbers of computing periods of year,t=time in year
		*/
		int principal=35000,number=12,time=10;
		double rate=6.25;
		
		System.out.println("The value of principal amount: "+principal);
		System.out.println("The value of rate : "+rate);
		System.out.println("The value of number : "+number);
		System.out.println("The value of time : "+time);
		
    double compound_interest=principal * Math.pow((1 + rate / (number * 100)), number * time);
    
    System.out.println("The Compound Interest is: ₹" + compound_interest);
	}

}
