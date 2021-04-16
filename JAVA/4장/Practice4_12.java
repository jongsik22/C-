import java.util.Scanner;

class Seat{ // �ϳ��� �¼��� ����� SeatŬ���� ����
	String name;
	public Seat() {name = "---";}
	public Seat(String n) {name = n;}
	public void setName(String n) {name = n;}
	public String getName() {return name;}
}

class SeatManage{ // ��޺� �¼��� �迭�� ����� SeatManage Ŭ���� 
	Seat [] S;
	Scanner sc = new Scanner(System.in);
	SeatManage(){ // ������ �¼� 10���� ���� �迭 ����
		S = new Seat[10]; 
		for(int i = 0; i < 10; i++) {
			S[i] = new Seat();
		}
	}
	public int getSeat(String n) { // �̸����� �¼���ȣ�� ã���ִ� �޼ҵ�
		int num = 0;
		int cnt = 0;
		for(int i = 0; i < 10; i++) {
			if((S[i].getName()).equals(n)) { // ��ġ�ϴ� �̸��� ������ �¼���ȣ ��ȯ
				num = i;
			}
			else {
				cnt++; // �ε����� �˻��Ҷ����� ã�� �̸��� ������ cnt++;
				if(cnt == 10) { // cnt�� �¼��� ����ŭ �������� = �˻��� �������� ã�����ߴ� = ã���̸��� ����.
					return -1; // -1 ��ȯ
				}
			}
		}
		return num;
	}
	public String getName(int s) {return S[s].getName();}
	public void setName(String n, int s) {S[s].setName(n);}
}
public class Reserv { // ������ �ϴ� Reserv Ŭ����
	SeatManage [] seat = new SeatManage[3]; // S/A/B��޺� SeatManage ��ü ����
	Scanner sc = new Scanner(System.in);
	Reserv(){
		for(int i = 0; i < 3; i++) {
			seat[i] = new SeatManage();
		}
	}
	public void res() { // 1. ���� : ������ �����ϴ� �޼ҵ�
		int input;
		while(true) {
			System.out.print("�¼����� S(1), A(2), B(3)>> ");
			input = sc.nextInt();
			if(input > 0 && input < 4) {
				break;
			}
			else { //�Է¹��� ���� 1~3�� �ƴҶ� �������
				System.out.println("1~3 �ٽ��Է�");
				continue;
			}
		}
		if(input == 1) {System.out.print("S>> ");}
		if(input == 2) {System.out.print("A>> ");}
		if(input == 3) {System.out.print("B>> ");}
		for(int i = 0; i < 10; i++) { // �Է¹��� ����� ������� �¼� �迭 ���
			System.out.print(seat[input - 1].getName(i) + ' ');
		}
		System.out.println();
		System.out.print("�̸�>> ");
		String n = sc.next();
		int s;
		while(true) {
			System.out.print("��ȣ>> ");
			s = sc.nextInt() - 1;
			if(s >= 10) { // �Է¹��� ��ȣ�� 1~10�� �ƴҶ� �������
				System.out.println("���� ��ȣ�Դϴ�. 1~10");
				continue;
			}
			else {
				break;
			}
		}
		seat[input - 1].setName(n, s); // �Է¹��� �̸��� �¼���ȣ�� set
	}
	public void show() { // 2.��ȸ : ���� ������� ��� �޼ҵ�
		System.out.print("S>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[0].getName(i) + ' ');
		}
		System.out.print("\nA>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[1].getName(i) + ' ');
		}
		System.out.print("\nB>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[2].getName(i) + ' ');
		}
		System.out.println("\n<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	public void cancel() { // 3. ��� : ������ ����ϴ� �޼ҵ�
		int input;
		while(true) {
			System.out.print("�¼����� S(1), A(2), B(3)>> ");
			input = sc.nextInt();
			if(input > 0 && input <4) {
				break;
			}
			else { //�Է¹��� ���� 1~3�� �ƴҶ� �������
				System.out.println("1~3 �ٽ��Է�");
			}
		}
		if(input == 1) {System.out.print("S>> ");}
		if(input == 2) {System.out.print("A>> ");}
		if(input == 3) {System.out.print("B>> ");}
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[input - 1].getName(i) + ' ');
		}
		int num;
		while(true) {
			System.out.print("\n�̸�>> ");
			String n = sc.next();
			num = seat[input - 1].getSeat(n);
			if(num == -1) { // SeatManage Ŭ������ getSeat �޼ҵ�(20����)���� �̸��˻��� ������ ��ȯ���� -1
				System.out.print("�����̸� �Դϴ�");
				continue;
			}
			else {
				break;
			}
		}
		seat[input - 1].setName("---", num); // �����ִ� �¼���ȣ�� ���¼��� �ǹ��ϴ� "---" set
	}
	public void end() {
		System.out.print("������ �����մϴ�.");
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Reserv r = new Reserv();
		System.out.println("��ǰ�ܼ�Ʈ ����ý��� �Դϴ�.");
		while(true) {
			System.out.print("���� : 1, ��ȸ : 2, ��� : 3, ������ : 4>> ");
			int input = sc.nextInt();
			if(input == 1) {r.res();}
			else if(input == 2) {r.show();}
			else if(input == 3) {r.cancel();}
			else if(input == 4) {r.end(); break;}
			else {System.out.println("��ȣ �ٽ� �Է�");}
		}
		sc.close();
	}

}
