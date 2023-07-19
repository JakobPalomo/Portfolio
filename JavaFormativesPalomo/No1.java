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
public class No1 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int N,Ctr=0;
        
        System.out.println("How many numbers to input?:");
        N=in.nextInt();
        System.out.println("Input your numbers");
        
        for (;Ctr<N;Ctr++)
        {            
            in.nextInt();
            
        }
    }

}
