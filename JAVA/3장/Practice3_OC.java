import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է� : ");
		Random r = new Random();
		String yn;
		while(true) {
			int cnt = 1;
			int n = r.nextInt(100);
			System.out.println("���� ���� �Ͽ����ϴ�. ���߾� ������ \n0-99");
			while(true) {
				System.out.print(cnt + ">> ");
				int i = sc.nextInt();
				if(i > n) {
					System.out.println("����");
					cnt++;
				}
				if(i < n) {
					System.out.println("����");
					cnt++;
				}
				if(i == n) {
					System.out.println("����");
					break;
				}
			}
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (y/n) ");
			yn = sc.next();
			if(yn.equals("y")) {
				continue;
			}
			else {
				System.out.print("�����մϴ�.");
				break;
			}
		}
		
	}
}
