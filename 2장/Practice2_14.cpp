#include <iostream>
#include <cstring>
using namespace std;
int main() {
	cout << "���������� 2000��, �Ƹ޸�ī�� 2300��, īǪġ�� 2500���Դϴ�.\n";
	char a[100]; //����
	int b; //����
	int c; //����
	int sum = 0; //����
	while (true) {
		cout << "�ֹ� >> ";
		cin >> a >> b;
		if (strcmp(a, "����������") == 0) {
			c = 2000 * b;
			cout << 2000 * b << "�� �Դϴ�.\n";
			sum += c;
		}
		else if (strcmp(a, "�Ƹ޸�ī��") == 0) {
			c = 2300 * b;
			cout << 2300 * b << "�� �Դϴ�.\n";
			sum += c;
		}
		else if (strcmp(a, "īǪġ��") == 0) {
			c = 2500 * b;
			cout << 2500 * b << "�� �Դϴ�.\n";
			sum += c;
		}
		else {
			cout << "�ٽ� �ֹ��� �ּ���.\n";
		}
		if (sum >= 20000)
		{
			cout << "������ " << sum << "���� �Ǹ��Ͽ� ī�並 �ݽ��ϴ�.";
			break;
		}
	}
}