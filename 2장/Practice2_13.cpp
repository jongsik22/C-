#include <iostream>
using namespace std;

int main() {
	int a;
	int b;
	cout << "*******************************************\n";
	while (true) {
		cout << "«�� : 1, ¥�� : 2, ������ : 3, ���� : 4 >> ";
		cin >> a;
		if (a <= 3 && a >= 1) {
			cout << "���κ�? ";
			cin >> b;
			if (a == 1)
			{
				cout << "«�� " << b << "�κ� ���Խ��ϴ�.\n";
			}
			else if (a == 2)
			{
				cout << "¥�� " << b << "�κ� ���Խ��ϴ�.\n";
			}
			else if (a == 3)
			{
				cout << "������ " << b << "�κ� ���Խ��ϴ�.\n";
			}
		}
		else if (a == 4)
		{
			cout << "���� ������ �������ϴ�. ";
			break;
		}
		else {
			cout << "�ٽ� �ֹ��ϼ���.\n";
		}
		
	}
}