#include <iostream>
#include <cstring>
using namespace std;

int main() {
	cout << "���ڿ� �Է� : ";
	char a[100];
	cin.getline(a, 100);
	int b = strlen(a);
	for (int i = 0; i < b; i++)
	{
		for (int j = 0; j <= i; j++)
		{
			cout << a[j];
		}
		cout << "\n";
	}
}