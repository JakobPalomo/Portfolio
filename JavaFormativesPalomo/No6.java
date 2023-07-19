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
public class No6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num, indiv, sum=0;
        String nums=" ";
        
        System.out.println("What's the number?:");
        num=in.nextInt();
        
        for (;num>0;) 
        {            
            indiv=num%10;
            sum+=indiv;
            num=num/10;
            nums=indiv+" "+nums;
            
        }
        System.out.println("The numbers individually are "+nums);
        System.out.println("The sum is "+sum);
    }
}
