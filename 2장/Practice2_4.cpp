#include <iostream>
using namespace std;
int main() {
	double a[5];
	double max = 0;
	for (int i = 0; i < 5; i++) {
		cin >> a[i];
		max = max > a[i] ? max : a[i];
	}
	cout << "���� ū �� = " << max;
}