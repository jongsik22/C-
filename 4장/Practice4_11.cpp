#include <iostream>
using namespace std;

class Container {
	int size;
public:
	Container() { size = 10; }
	void fill();
	void consume();
	int getSize();
};

void Container::fill() {
	size = 10;
}
void Container::consume() {
	size -= 1;
}
int Container::getSize() {
	return size;
}

class CoffeeVendingMachine {
	Container tong[3];
	// Ŀ��, ��, ����
	void fill();
	void selectEspresso();
	void selectAmericano();
	void selectSugarCoffee();
	void show();
public:
	void run();
};

void CoffeeVendingMachine::fill() {
	for (int i = 0; i < 3; i++)	{
		tong[i].fill();
	}
	show();
}
void CoffeeVendingMachine::selectEspresso() {
	tong[0].consume();
	tong[1].consume();
}
void CoffeeVendingMachine::selectAmericano() {
	tong[0].consume();
	tong[1].consume();
	tong[1].consume();
}
void CoffeeVendingMachine::selectSugarCoffee() {
	tong[0].consume();
	tong[1].consume();
	tong[1].consume();
	tong[2].consume();
}
void CoffeeVendingMachine::show() {
	cout << "Ŀ�� " << tong[0].getSize() << ", �� " << tong[1].getSize() << ", ���� " << tong[2].getSize() << endl;
}
void CoffeeVendingMachine::run() {
	int n;
	cout << "***** Ŀ�����Ǳ⸦ �۵��մϴ�.*****" << endl;
	while (true) {
		cout << "�޴��� �����ּ���(1 : ����������, 2 : �Ƹ޸�ī��, 3 : ����Ŀ��, 4 : �ܷ�����, 5 : ä���)>>";
		cin >> n;
		if (n == 1) {
			if (tong[0].getSize() >= 1 && tong[1].getSize() >= 1) {
				selectEspresso();
				cout << "���������� �弼��." << endl;
			}
			else {
				cout << "���ᰡ �����մϴ�." << endl;
			}
		}
		else if (n == 2) {
			if (tong[0].getSize() >= 1 && tong[1].getSize() >= 2) {
				selectAmericano();
				cout << "�Ƹ޸�ī�� �弼��." << endl;
			}
			else {
				cout << "���ᰡ �����մϴ�." << endl;
			}
		}
		else if (n == 3) {
			if (tong[0].getSize() >= 1 && tong[1].getSize() >= 1 && tong[2].getSize() >= 1) {
				selectSugarCoffee();
				cout << "����Ŀ�� �弼��." << endl;
			}
			else {
				cout << "���ᰡ �����մϴ�." << endl;
			}
		}
		else if (n == 4) {
			show();
		}
		else if (n == 5) {
			fill();
		}
	}
}

int main() {
	CoffeeVendingMachine c;
	c.run();
}