#include <iostream>
#include <string>
using namespace std;

int main() {
	string s, find, repl;
	int num;
	cout << "�������� ���ڿ��� �Է��ϼ���. �Է��� ���� &�����Դϴ�." << endl;
	getline(cin, s, '&');
	cin.ignore();
	cout << "\n";
	cout << "find : ";
	getline(cin, find);
	cout << "replace : ";
	getline(cin, repl);
	while (true) {
		num = s.find(find);
		if (num != -1)
		{
			s.replace(num, find.length(), repl);
		}
		else {
			break;
		}
	}
	
	cout << s;
}
