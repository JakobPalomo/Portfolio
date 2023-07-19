#include <iostream>
#include <cmath>

using namespace std;
double validate(double a);
double hypotenuse(double a, double b);
double area(double a, double b);
void display(double hyp,double ar);

int main (){
	double a,b,hyp,ar;
	cout<<"Side A?"<<endl;
	cin>>a;
	validate(a);
	cout<<"Side B?"<<endl;
	cin>>b;
	validate(b);
	hyp=hypotenuse(a,b);
	ar=area(a,b);
	display(hyp, ar);
}
double validate(double a){
	while (a<=0) 
    {
        cout<<"Invalid input, re-enter value";
        cin>>a;
    }
    return a;
}
double hypotenuse(double a, double b)
{
    return sqrt((a*a)+(b*b));   
}
double area(double a, double b)
{
    return (a*b)/2;
}
void display(double hyp,double ar)
{
    cout<<"The hypotenuse is "<<hyp<<endl;
    cout<<"The area is "<<ar<<endl;
}

