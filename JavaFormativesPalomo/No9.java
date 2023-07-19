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
public class No9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int year=0,popu;
        
        for (popu=9870;popu<30000;year++) 
        {            
            System.out.println("Year "+year+" has "+popu);
            popu*=1.1;
            
    
        }
        
        System.out.println("It will take "+year+" to go over 30000");
    }
}
