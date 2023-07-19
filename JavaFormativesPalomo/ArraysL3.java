/*

 */
import java.util.*;
public class ArraysL3 
{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int N,n;
        N=validateN();
        int[] A=new int[N];
        n=N/2;
        int[] B=new int[n];
        loadArray(A,N);
        swapAddElements(A,N,B,n);
        display(A,N,B,n);
    }
    
    public static int validateN()
    {
        int n;
        
        System.out.print("How many elements(should be even)?:");
            n=in.nextInt();
        while (n%2!=0) 
        {            
            System.out.print("Error(should be even)?:");
            n=in.nextInt();
        }
        return n;
    }
    
    public static void loadArray(int[] A,int N)
    {
        Random rand=new Random();
        for (int i = 0; i < A.length; i++) 
            A[i]=10+rand.nextInt(21);
    }
    
    public static void swapAddElements(int[] A, int N,int [] B,int n)
    {
        int temp,i,j=A.length-1;
        System.out.println("Elements of A: "+Arrays.toString(A));
        for (i = 0; i < A.length/2; i++,j--) 
        {
            B[i]=A[i]+A[j];
            temp=A[j];
            A[j]=A[i];
            A[i]=temp;
        }
    }
    
    public static void display(int[] A, int N,int [] B,int n)
    {
        System.out.println("Elements of A after swapping: "+Arrays.toString(A));
        System.out.println("New elements of B: "+Arrays.toString(B));
    }
}
