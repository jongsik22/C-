#include <iostream>
#include <string>
using namespace std;

class MyIntStack {
	int *p;
	int tos;
	int size;
public:
	MyIntStack() {}
	MyIntStack(int size) {
		p = new int[size];
		tos = 0;
		this->size = size;
	}
	MyIntStack(const MyIntStack &s) {
		this->size = size;
		this->tos = tos;
		this->p = new int[size];
	}
	~MyIntStack() {}
	bool push(int n) {
		if (tos > size) {
			return false;
		}
		else {
			p[tos] = n;
			tos++;
			return true;
		}
	}
	bool pop(int &n) {
		tos--;
		if (tos < 0) {
			return false;
		}
		else {
			n = p[tos];
			return true;
		}
	}

};

int main() {
	MyIntStack a(10);
	a.push(10);
	a.push(20);
	MyIntStack b = a;
	b.push(30);

	int n;
	a.pop(n);
	cout << "���� a���� ���� �� " << n << endl;
	b.pop(n);
	cout << "���� b���� ���� �� " << n << endl;
}