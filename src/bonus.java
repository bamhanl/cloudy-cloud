import java.util.Scanner;

public class bonus {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����ǰ���: ");
		int x=input.nextInt();
		
		if(x>10000000)	
			System.out.println("���ʽ�10%");
		System.out.print(x*10/100);
		
		
	}

}
