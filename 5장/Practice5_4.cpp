#include <iostream>
using namespace std;

bool bigger(int a, int b, int& big) {
	if (a == b) {
		return true;
	}
	else {
		big = a > b ? a : b;
		return false;
	}
}

int main() {
	int n, m, big;
	cout << "�� 1 : ";
	cin >> n; 
	cout << "�� 2 : ";
	cin >> m;
	bigger(n, m, big);
	cout << big;
}