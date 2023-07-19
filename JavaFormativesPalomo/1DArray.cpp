#include <iostream>
//first 25 elements are equal to the square of the index 
//variable, and the last 25 components are equal to three times the index variable
using namespace std;

int main () {
	double alpha[50];
	int ctr=1;
        
    for (int i = 0; i < 50; i++,ctr++) 
    {
        alpha[i]=i;
        if (i<=24) 
        {
            alpha[i]=i*i;
        }
        if (i>24) 
        {
            alpha[i]*=3;
        }
        cout<<alpha[i]<<"\t";
        if (ctr==10) 
        {
            cout<<endl;
            ctr=0;
        }
    
    }
}

