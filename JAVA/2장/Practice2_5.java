import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��ϼ��� : ");
		int a[] = new int[3];
		for(int i  = 0; i < 3 ; i++) {
			a[i] = sc.nextInt();
		}
		if(a[0] + a[1] > a[2] && a[0] + a[2] > a[1] && a[1] + a[2] > a[0]) {
			System.out.print("�ﰢ���� �˴ϴ�.");
		}
		else {
			System.out.print("�ﰢ�� �ȴ�");
		}
		
	}

}
