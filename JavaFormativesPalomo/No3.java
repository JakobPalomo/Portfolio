/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class No3 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int N,n=1,Ctr=0,sum=1;
        
        System.out.println("Find factorial of what number?:");
        N=in.nextInt();
        
        for (;Ctr<N;Ctr++) 
        {            
            sum=sum*n++;
            
        }
        
        System.out.println("The factorial is "+sum);
    }
}
