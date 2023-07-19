#include <iostream>

using namespace std;

int main (){
	int x;
	double sum=1.0;
	cout << "Find a factorial of what number?" << endl;
	cin >> x;
	for (int i=1;i<=x;i++){
		sum=i*sum;
	}
	cout<<"The factorial is "<< sum;
}

