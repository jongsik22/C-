import java.util.Scanner;

class Phone{
	String name, tel;
	public Phone(String n, String t) {name = n; tel = t;}
	String getName() {return name;}
	String getTel() {return tel;}
}

class PhoneBook{
	Phone p[];
	int num;
	Scanner sc = new Scanner(System.in);
	public PhoneBook(int n) {
		num = n;
		p = new Phone[n];
		save();
	}
	void save() {
		String name, tel;
		for(int i = 0; i < num; i++) {
			System.out.print(i + 1 + "��° �̸��� ��ȭ��ȣ(�̸��� ��ȭ��ȣ�� ��ĭ���� �Է�) >>");
			name = sc.next();
			tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		find();
	}
	void find() {
		while(true) {
			int cnt = 0;
			System.out.print("�˻��� �̸� : ");
			String name = sc.next();
			if(name.equals("�׸�")) {
				System.out.print("����");
				break;
			}
			else {
				for(int i = 0; i < num; i++) {
					if((p[i].name).equals(name)) {
						System.out.println(p[i].getName() + "�� ��ȣ�� " + p[i].getTel() + " �Դϴ�.");
						break;
					}
					cnt ++;
				}
				if(cnt == 3) {
					System.out.println(name + "�� �����ϴ�.");
				}
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� >> ");
		int n = sc.nextInt();
		PhoneBook p = new PhoneBook(n);
	}

}
