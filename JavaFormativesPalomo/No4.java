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
public class No4 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=30,n=1,Ctr=3;
        double sum=1;

        for (;Ctr<=N;Ctr=Ctr+3) 
        {            
            sum=Ctr*0.3048;
            System.out.print(Ctr+" feet is equivalent to ");
            System.out.printf("%.2f meters%n",sum);
            
        }
    }
}
