import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ� ���� �Է� : ");
		int a = sc.nextInt();
		if(a / 10 == a % 10)
		{
			System.out.print("10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		}
		else
		{
			System.out.print("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		}
		
	}

}
