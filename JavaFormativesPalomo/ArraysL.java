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
public class ArraysL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size,i,c=0,p=0,h=0;
        System.out.println("Data size?");
        
        for (size=in.nextInt(); size<0||size>50;size=in.nextInt()) 
            System.out.println("Invalid input\nEnter a data size");
        
        int[]temp=new int[size];
        
        Random rand=new Random();
        for (i = 0; i < temp.length; i++) 
            temp[i]=rand.nextInt(101);
        System.out.println("The temperatures are:"+Arrays.toString(temp));
        
        for ( i = 0; i < temp.length; i++) 
        {
            if(temp[i]<60)
            {
                c++;
            }
            else if(temp[i]<=84)
            {
                p++;
            }
            else
            {
                h++;
            }
        }
        System.out.print("\nNumber of cold days "+c+" Recorded temps are: ");
        for ( i = 0; i < temp.length; i++) 
        {
            if(temp[i]<60)
                System.out.print(" "+temp[i]);
        }
        System.out.print("\nNumber of pleasant days "+p+" Recorded temps are: ");
        for ( i = 0; i < temp.length; i++) 
        {
            if(temp[i]>60&&temp[i]<84)
                System.out.print(" "+temp[i]);
        }
        System.out.print("\nNumber of hot days "+h+" Recorded temps are: ");
        for ( i = 0; i < temp.length; i++) 
        {
            if(temp[i]>=85)
                System.out.print(" "+temp[i]);
        }
        System.out.println("");
    }
}
