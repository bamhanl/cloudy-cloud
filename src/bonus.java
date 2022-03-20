import java.util.Scanner;

public class bonus {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("물건판가격: ");
		int x=input.nextInt();
		
		if(x>10000000)	
			System.out.println("보너스10%");
		System.out.print(x*10/100);
		
		
	}

}
