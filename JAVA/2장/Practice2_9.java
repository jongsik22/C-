import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է� : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		System.out.print("�� �Է� : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		if((Math.sqrt((x - x1)*(x - x1) + (y - y1) * (y - y1)) <= r)) {
			System.out.print("�� (" + x1 + ", " + y1 + ")�� �� �ȿ� �ִ�.");
		}
		else {
			System.out.print("�� (" + x1 + ", " + y1 + ")�� �� �ۿ� �ִ�.");
		}
	}

}
