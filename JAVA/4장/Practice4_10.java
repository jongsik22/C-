import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		
		int n = 0;
		int cnt = 0;
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				n = i;
			}
			else {
				cnt++;
			}
		}
		String s;
		if(cnt == 5) {
			s = word + " �� �����ϴ�.";
		}
		else {
			s = word + " �� " + eng[n]; 
		}
		
		return s;
	}
}


public class Main {

	public static void main(String[] args) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ѱ� �ܾ� : ");
			String word = sc.next();
			if(word.equals("�׸�")) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println(Dictionary.kor2Eng(word));
			}
		}
	}

}
