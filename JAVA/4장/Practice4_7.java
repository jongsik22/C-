import java.util.Scanner;
class Day{
	private String work;
	public Day() {work = null;}
	public void set(String w) {work = w;}
	public String get() {return work;}
	public void show() {
		if(work == null) {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println(work + "�Դϴ�.");
		}
	}
}

class MonthSchedule{
	int day;
	Day [] ddd;
	Scanner sc = new Scanner(System.in);
	public MonthSchedule(int d) {
		day = d; 
		ddd = new Day[day];
		for(int i = 0; i < ddd.length; i++) {
			ddd[i] = new Day();
		}
		
	}
	public void input() {
		System.out.print("��¥(1~" + day + ")?");
		int d = sc.nextInt();
		System.out.print("�� ��(��ĭ�����Է�)?");
		String w = sc.next();
		ddd[d].set(w);
	}
	public void view() {
		System.out.print("��¥(1~" + day + ")?");
		int d = sc.nextInt();
		System.out.println(d + "���� ������");
		ddd[d].show();
	}
	public void finish() {System.out.print("���α׷��� �����մϴ�.");}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int n = sc.nextInt();
			if(n == 1) {
				input();
				continue;
			}
			else if(n == 2) {
				view();
				continue;
			}
			else if(n == 3) {
				finish();
				break;
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
