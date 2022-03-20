import java.util.Scanner;

public class SecondConverter {

	public static void main(String[] args) {
		double result;
		result= 100000/60.0;
		System.out.println("100000/60.0="+result);
		
		double result1;
		result1= 100000/3600.0;
		System.out.println("100000/3600.0="+result1);
		
		double result2;
		result2= 100000/(24*3600.0);
		System.out.println("100000/(24*3600.0)="+result2);
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("second: ");
		int x=input.nextInt();
		
	if(x<1135296000)
		System.out.print("FALSE");
		

	}

}
