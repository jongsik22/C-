#include <iostream>
#include <string>
using namespace std;

class Trace {
	static string tag[100];
	static string debug[100];
	static int cnt;
public:
	static void put(string t, string d);
	static void print(string t);
	static void print();
};

int Trace::cnt = 0;
string Trace::tag[100] = {};
string Trace::debug[100] = {};

void Trace::put(string t, string d) {
	tag[cnt] = t;
	debug[cnt] = d;
	cnt++;
}
void Trace::print(string t) {
	cout << t << "�±��� Trace ������ ����մϴ�." << endl;
	for (int i = 0; i < cnt; i++) {
		if (tag[i] == t) {
			cout << tag[i] << debug[i] << endl;
		}
	}
}void Trace::print() {
	cout << "��� Trace ������ ����մϴ�." << endl;
	for (int i = 0; i < cnt; i++) {
		cout << tag[i] << debug[i] << endl;
	}
}

void f() {
	int a, b, c;
	cout << "�� ���� ������ �Է��ϼ��� >> ";
	cin >> a >> b;
	Trace::put("f()", "������ �Է� �޾���");
	c = a + b;
	Trace::put("f()", "�� ���");
	cout << "���� " << c << endl;
}

int main() {
	Trace::put("main()", "���α׷� �����մϴ�");
	f();
	Trace::put("main()", "����");

	Trace::print("f()");
	Trace::print();
}