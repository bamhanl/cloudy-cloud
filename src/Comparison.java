import java.util.Scanner;

public class Comparison {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�: ");
		int x=input.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�: ");
		int y=input.nextInt();
		
		if(x<y)
			System.out.println("ū ���� 20");
	
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int x1=input1.nextInt();
		
		if(x1>0)
			System.out.println("����Դϴ�");
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int x2=input2.nextInt();
		
		if(x2%2==0)
			System.out.print("����̸鼭");
	        System.out.println("¦���Դϴ�");
		
		
		
	}
	


}
