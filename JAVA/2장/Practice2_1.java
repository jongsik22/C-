import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���>>>");
		int won = sc.nextInt();
		double dollar = 1100.0;
		System.out.println(won + "���� $" + won/dollar + "�Դϴ�.");
	}

}
