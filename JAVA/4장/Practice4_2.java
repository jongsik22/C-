import java.util.Scanner;
class Grade{
	int math, science, english;
	public Grade(int m, int s, int e) {math = m; science = s; english = e;}
	int average() {return ((math + science + english) / 3);}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		sc.close();
	}

}
