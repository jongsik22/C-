#include <iostream>
#include <string>
using namespace std;
class Player {
	string name;
public:
	string getName() { return name; }
	void setName(string p) { name = p; }
};
class WordGame {
	Player *p;
	int members;
	string word;
public:
	void setMembers(int n) { members = n; }
	void run();
};

void WordGame::run() {
	string first = "�ƹ���";
	cout << "�����ձ� ������ �����մϴ�." << endl;
	cout << "���ӿ� �����ϴ� �ο��� ����Դϱ�? ";
	cin >> members;
	setMembers(members);
	p = new Player[members];
	string namee;
	for (int i = 0; i < members; i++) {
		cout << "�������� �̸��� �Է��ϼ���. ��ĭ ���� >>";
		cin >> namee;
		p[i].setName(namee);
	}
	cout << "�����ϴ� �ܾ�� �ƹ��� �Դϴ�." << endl;
	int cnt = 0;
	while (true) {
		cout << p[cnt].getName() << ">> ";
		cin >> word;
		
		if (word.length() < 4) {
			break;
		}
		if ((first.at(first.length() - 2) == word.at(0)) && (first.at(first.length() - 1) == word.at(1))) {
			first = word;
			cnt++;
			if (cnt == 3) {
				cnt = 0;
			}
		}
		else {
			break;
		}
		
	}
}
int main() {
	WordGame game;
	game.run();
	

}