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
public class Forwhile2nums 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int firstNum,secondNum,sum=0,sums=0,num=0;
        String odd="", sqrs="";
        
        System.out.println("What is your 1st & 2nd number, (1st<2nd)");
        System.out.println("1st number is?");
        firstNum=in.nextInt();
        System.out.println("2nd number is?");
        secondNum=in.nextInt();
        
        
        for (;firstNum<=secondNum;firstNum++) 
        {  
            if (firstNum%2!=0)
            {
                odd=odd+" "+firstNum;
                sums+=firstNum*firstNum;
            }
            if (firstNum%2==0) 
            {
                sum+=firstNum;
            }

            firstNum++;
            
        }
        System.out.println("Odd numbers between :"+odd);
        System.out.println("sum of all the even numbers between :"+sum);
        System.out.println("Sum of sqr of odd no.s :"+sums); 
        System.out.println("Sqr of numbers between 1&10:\nNumber\t\tSquared");
         for (;num<10;num++) 
            {             
             if (num>1&&num<10)
            {
                System.out.println(num+"\t\t"+num*num);
            }
             
         } 
         char lett;
        for (lett='A';lett<='Z';lett++) 
        {            
            System.out.printf("%c ",lett);
            
        }
         System.out.println("\n\n");
    }
    
}
