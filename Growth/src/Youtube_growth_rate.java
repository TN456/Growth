import java.util.Scanner;
public class Youtube_growth_rate{
	public static void main(String[] args) {
		//a- No of subscribers
		//r- Rate of growth
		//x- Time duration
		//y- Data
        //y=a(1+r)^x  //Formula for growth rate      
		System.out.println("Subscribers count");
		System.out.println("Usage of Mathematical concept ");
		
		System.out.println("How many subscribers(a): ");
		Scanner scan= new Scanner(System.in);           //Takes input from user for no of subscribers
		int a=scan.nextInt();
		
		
		System.out.println("Enter the growth rate(r): ");
		double r=scan.nextDouble();        //Takes input from user
		
		System.out.println("Time interval in days(x): ");
		int x=scan.nextInt();             // Takes input from user
		
	System.out.println("Number of Subscribers: ");
	System.out.println(""+CalculateSubscribers(a,r,x));	  //Displays the number of Subscribers
	}
	public static int CalculateSubscribers(int a,double r, int x) {  //Calculate function for no of subscribers
		return (int)(a*Math.pow((1+r),x));
	}
}
