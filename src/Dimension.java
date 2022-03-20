import java.util.Scanner;

public class Dimension {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("원의 반지름: ");
	    int x= input.nextInt();
	    
	    System.out.print("원의 둘레:");
	    System.out.println(2*x*3.14);
	    
	    Scanner input1 = new Scanner(System.in);
	    
	    System.out.println("삼각형 밑변: ");
	    int x1= input1.nextInt();
	    
	    System.out.println("삼각형 높이: ");
	    int x2= input1.nextInt();
	    
	    System.out.print("삼각형 넓이:");
	    System.out.print(x1*x2/2);
	    
	    
	    
	    
		

	}

}
