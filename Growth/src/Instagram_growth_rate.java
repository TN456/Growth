import java.util.Scanner;

public class Instagram_growth_rate {
	public static void main(String[] args) {
		//a- Number of followers currently 
		//b- Number of unfollowers
		//c- Number of posts per month
		//r- Rate of growth
		//t-Time
		//r=((a^1/t-b)*c)*100 //Formula for growth rate
		System.out.println("Time interval in days(t): ");
		Scanner scan1=new Scanner(System.in);     //Takes user input
		float t=scan1.nextFloat();
		
		
		System.out.println("Enter the current number of followers(a): ");
		Scanner scan2=new Scanner(System.in);       //Takes user input
		float a=scan2.nextFloat();
		
		System.out.println("Enter the number of unfollowers(b): ");
		Scanner scan3=new Scanner(System.in);       //Takes user input
		float b=scan3.nextFloat();
		
		
		System.out.println("Enter the number of posts per month(c): ");
		Scanner scan4=new Scanner(System.in);       //Takes user input
		int c=scan4.nextInt();
		
		System.out.println("Growth rate(r) in percentage: ");
		System.out.println(""+Calculategrowthrate(t,a,b,c)); //Displays the growth rate
	}
	public static double Calculategrowthrate(float t,float a, float b, int c) 
	{  //Calculate function for growth rate
		double T=1/t;  // Equating 1/t to the T
		double A=b/a;   // Unfollowers/Followers=A
		double res=Math.pow(A,T);    //Cal
		double r=Math.abs(((res/c)-1)*100);  //Formula for calculating the Growth rate
		return r;   //Returning the result
	}

}
