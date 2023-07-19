/*

 */
import java.util.*;
public class ArraysL1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int[] A=new int[15];
        int X,temp;
        
        Random rand=new Random();
        for (int i = 0; i < A.length; i++) 
            A[i]=35+rand.nextInt(16);
        
        for(int i=0; i<A.length-1;i++)
        for(int j=1; j<A.length; j++)
            if(A[j]<A[j-1])
            {
            temp=A[j];
            A[j]=A[j-1];
            A[j-1]=temp;
        }
        
        System.out.println("Elements of A: "+Arrays.toString(A));
        
        System.out.println("Input X");
        X=in.nextInt();
        
        for (int i = 0; i < A.length; i++) 
        {
            if (A[i]<X) 
            {
                A[i]=X;
            }
        }
        System.out.println("New Elements of X: "+Arrays.toString(A));
    }
}
