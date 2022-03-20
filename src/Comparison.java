import java.util.Scanner;

public class Comparison {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하시오: ");
		int x=input.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		int y=input.nextInt();
		
		if(x<y)
			System.out.println("큰 수는 20");
	
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		int x1=input1.nextInt();
		
		if(x1>0)
			System.out.println("양수입니다");
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		int x2=input2.nextInt();
		
		if(x2%2==0)
			System.out.print("양수이면서");
	        System.out.println("짝수입니다");
		
		
		
	}
	


}
