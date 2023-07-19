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
public class Bearing {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int tB,cor;
        
        System.out.println("Enter your true bearing");
        tB=in.nextInt();
        
        if (tB==0||tB==360)
            System.out.println("N");
        if (tB>0&&tB<90)
        {
            cor=tB;
            System.out.println("N "+cor+" E");
        }
        if (tB==90)
            System.out.println("E");
        if (tB>90&&tB<180)
        {
            cor=180-tB;
            System.out.println("S "+cor+" E");
        }
        if (tB==180)        
            System.out.println("S");
        if (tB>180&&tB<270)
        {
            cor=tB-180;
            System.out.println("S "+cor+" W");
        }
        if (tB==270)
            System.out.println("W");
        if (tB>270&&tB<360)
        {
            cor=360-tB;
            System.out.println("N "+cor+" W");
        }
    }
}
