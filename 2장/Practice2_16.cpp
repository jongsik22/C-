#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main() {
	int sum = 0;
	int cnt = 0;
	int alpha[26];
	char a[10000];
	char A;
	cout << "���� �ؽ�Ʈ�� �Է��ϼ���. ������׷��� �׸��ϴ�.\n�ؽ�Ʈ�� ���� ; �Դϴ�. 10000������ �����մϴ�.";
	cin.getline(a, 10000, ';');
	for (int n = 0; n < strlen(a); n++)
	{
		if (isalpha(a[n]) != 0)
		{
			sum++;
		}
	}
	cout << "�� ���ĺ� �� : " << sum << "\n\n";
	for (char c = 'a'; c <= 'z'; c++)
	{
		for (int i = 0; i < strlen(a); i++)
		{
			if (isalpha(a[i]) != 0)
			{
				A = tolower(a[i]);
				if (A == c)
				{
					cnt++;
				}
				sum++;
			}
		}
		cout << c << " (" << cnt << ") : ";
		for (int j = 0; j < cnt; j++)
		{
			cout << '*';
		}
		cnt = 0;
		cout << "\n";
	}
	
}