/*

 */
public class ArraysL2 {
    public static void main(String[] args) 
    {
        double[] alpha=new double[50];
        int ctr=1;
        
        for (int i = 0; i < alpha.length; i++,ctr++) 
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
            System.out.print(alpha[i]+"\t");
            if (ctr==10) 
            {
                System.out.println("");
                ctr=0;
            }
        }     
    }
}
