import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		String name;
		while(true) {
			int cnt = 0;
			System.out.print("���� �̸� >> ");
			name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			else {
				for(int i = 0; i < course.length; i++) {
					if(course[i].equals(name)) {
						System.out.println(name + "�� ������ " + score[i]);
						cnt++;
						break;
					}
				}
				if(cnt == 0) {
					System.out.println("���°���");
				}
			}
		}
	}

}
