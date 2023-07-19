#include <iostream>
#include <cstdlib>
//frequency code
using namespace std;

int main ()
	{
		int matrixA[4][4];
        int matrixB[4][4];
        
        cout<<"Matrix A";
        for (int r = 0; r < 4;r++)
        {
            cout<<endl;
            for (int c = 0; c < 4; c++)
            {
                matrixA[r][c]=(rand()%20)+1;
                matrixB[c][r]=matrixA[r][c];
                cout<<matrixA[r][c]<<"\t";
            }
        }
        cout<<"\nMatrix B";
        
        for (int r = 0; r < 4;r++)
        {
            cout<<endl;
            for (int c = 0; c < 4; c++)
                cout<<matrixB[r][c]<<"\t";
        }
    }


