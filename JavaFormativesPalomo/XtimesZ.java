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
public class XtimesZ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int ctr=1;

        for (int x = 1; x < 6; x++) 
        {
            double y=0;
            for (int z = 2; z < 7; z++) 
            {
                if(x==z||z==x)
                {
                    System.out.println("term "+ctr+++" Function undefined");
                }
                else
                {
                    y=x*z/(x-z);
                    System.out.printf("term "+ctr+++" is "+y+"\n");
                }        
            }
        }
    }
    
}
