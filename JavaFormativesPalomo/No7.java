/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class No7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num, indiv;
        String nums="";
        
        System.out.println("What's the number?:");
        num=in.nextInt();
        
        for (;num>0;) 
        {            
            indiv=num%10;
            num=num/10;
            nums=nums+indiv;
            
        }
        System.out.println("The number backwards is "+nums);
        System.out.print("\n\n");
    }
}
