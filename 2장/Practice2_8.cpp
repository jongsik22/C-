#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "5 ���� �̸��� ';'���� �����Ͽ� �Է��ϼ���\n>>";
	char name[100];
	int max = 0;
	string a;
	for (int i = 1; i <= 5; i++)
	{
		cin.getline(name, 100, ';');
		cout << i << ":" << name << "\n";
		if (max < strlen(name))
		{
			max = strlen(name);
			a = name;
		}
	}
	cout << "���� �� �̸��� " << a;
}