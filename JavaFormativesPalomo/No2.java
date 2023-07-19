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
public class No2 
{
    public static void main(String[] args) 
    {
         Scanner in=new Scanner(System.in);
        int N,n,Ctr=0,sum=0;
        
        System.out.println("How many numbers to input?:");
        N=in.nextInt();
        System.out.println("Input your numbers");
        
        for (;Ctr<N;Ctr++) 
        {            
            n=in.nextInt();
            sum=sum+n;
            
        }
        
        System.out.println("The sum is "+sum);
    }
}
