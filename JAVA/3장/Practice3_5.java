import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		int n[] = new int[10];
		for(int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int j = 0; j < 10; j++) {
			if(n[j] % 3 == 0) {
				System.out.print(n[j] + " ");
			}
		}
	}

}
