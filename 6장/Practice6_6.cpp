#include <iostream>
#include <string>
using namespace std;

class ArrayUtility2 {
public:
	static int* concat(int s1[], int s2[], int size);
	static int* remove(int s1[], int s2[], int size, int &retSize);
};

int* ArrayUtility2::concat(int s1[], int s2[], int size) {
	int *s3;
	s3 = new int[size];
	for (int i = 0; i < size / 2; i++) {
		s3[i] = s1[i];
		s3[(size / 2) + i] = s2[i];
	}
	return s3;
}
int* ArrayUtility2::remove(int s1[], int s2[], int size, int &retSize) {
	int cnt = 0;
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
			if (s1[i] == s2[j]) {
				retSize++;
			}
		}
	}
	int *s3 = new int[retSize];
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
			if (s1[i] != s2[j]) {
				s3[cnt] = s1[i];
				cnt++;
			}
		}
	}
	return s3;
}

int main() {
	int x[5];
	int y[5];
	int retSize;
	cout << "������ 5�� �Է��϶�. �迭 x�� �����Ѵ�>>";
	for (int i = 0; i < 5; i++) {
		cin >> x[i];
	}
	cout << "������ 5�� �Է��϶�. �迭 y�� �����Ѵ�>>";
	for (int i = 0; i < 5; i++) {
		cin >> y[i];
	}
	int *p = ArrayUtility2::concat(x, y, 10);
	cout << "��ģ ���� �迭�� ����Ѵ�." << endl;
	for (int i = 0; i < 10; i++) {
		cout << p[i] << ' ';
	}
	p = ArrayUtility2::remove(x, y, 5, retSize);
	cout << "�迭 x[]���� y[]�� �� ����� ����Ѵ� ������ " << retSize << endl;
	for (int i = 0; i < retSize; i++) {
		cout << p[retSize] << ' ';
	}
}