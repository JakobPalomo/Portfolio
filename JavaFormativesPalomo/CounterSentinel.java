 /*
    Jakob Michael M. Palomo 1-ITG
 */

import java.util.Scanner;
public class CounterSentinel 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner (System.in);
        char choice='K';
        
        System.out.println("This program is a calculator for finding arithmetic series,");
        System.out.println("geometric series, harmonic mean,");
        System.out.println("geometric mean, and largest prime number.\n");
        
        while(choice!='Q')
        {
        System.out.println("Select your method:");
        System.out.println("A-Arithmetic series");
        System.out.println("B-Geometric series");
        System.out.println("C-Harmonic mean");
        System.out.println("D-Geometric mean");
        System.out.println("E-Largest prime number");
        System.out.println("Q-Quit program");
        
        System.out.print("\nWhat is your choice?:");
        choice=in.next().charAt(0);
        choice=Character.toUpperCase(choice);
        
        while (choice!='A'&&choice!='B'&&choice!='C'&&choice!='D'&&choice!='E'&&choice!='Q')
        {
            System.out.println("Invalid operation type, reinput");
            choice=in.next().charAt(0);
            choice=Character.toUpperCase(choice);
        }
        
        switch (choice)
        {
            case 'A': 
                int a,d,n,ans=0;
                
                System.out.println("What is your a,d,n(n greater than 0)");
                a=in.nextInt();
                d=in.nextInt();
                n=in.nextInt();
                
                while (n<0)
                {
                    System.out.println("Invalid n input");
                    n=in.nextInt();
                }
                
                for (int i=0; i < n; i++) 
                {
                    ans=ans+(a+(i*d));
                    System.out.println("term "+i+" is "+(a+(i*d)));
                }
                
                System.out.println("\nArethmetic series is "+ans+"\n");
                break;
               
            case 'B':
                int r,geosum=0;
               
                System.out.println("What is your a,r,n(n greater than 0)");
                a=in.nextInt();
                r=in.nextInt();
                n=in.nextInt();
               
                while (n<0)
                {
                    System.out.println("Invalid n input");
                    n=in.nextInt();
                }
               
                for (int i=0,ct=1; i < n; i++,ct++) 
                {
                    geosum=geosum+ (int) (a*(Math.pow(r, i)));
                    System.out.println("term "+ct+" is "+(int)(a*(Math.pow(r, i))));
                }
                System.out.println("\nGeometric series is "+geosum+"\n");
                break;
                
            case 'C':
                double h,bsum=0,cctr=0,harmonic=0;
                
                System.out.println("What are your inputs? End with 0");
                h=in.nextInt();
                
                while (h!=0)
                {
                    bsum+=1/h;
                    cctr++;
                    h=in.nextInt();
                }
                
                harmonic=cctr/bsum;
                System.out.println("Harmonic mean is "+harmonic+"\n");
                break;
                
            case 'D':
                double gM=0,g,gctr=0,gpro=1;
                
                System.out.println("What are your inputs, 0 ends it");
                g=in.nextInt();
                
                while(g!=0)
                {
                    while (g<0)
                    {
                        System.out.println("Invalid input");
                        g=in.nextInt();
                    }
                gctr++;
                gpro*=g;
                g=in.nextInt();
                }
                gM=Math.pow(gpro, 1/gctr);

                System.out.println("The geometric mean is "+gM+"\n");
                break;
                
            case 'E':
              
                int pnum,bnum=0;
                
                System.out.println("What are your inputs (0 ends it)");
                pnum=in.nextInt();
                
                while(pnum!=0)
                {
                    while(pnum<0)
                    {
                        System.out.print("Invalid input try another:");
                        pnum=in.nextInt();
                    }
                    
                    //boolean prime=false;
                    int mult=0;
                    /*
                    for (int pr=2; pr <= pnum/2;++pr)
                    {
                        if (pnum%pr==0) 
                        {
                            prime=true;
                            break;
                        }   
                    } 
                    */
                    for (int pr=1; pr <= pnum;pr++)
                    {
                        if (pnum%pr==0) 
                        {
                            mult++;
                        }   
                    }
                    
                    if (mult<=2) 
                    {
                        if (pnum>bnum) 
                        {
                            bnum=pnum;
                        }
                    }
                    pnum=in.nextInt();  
                }
                System.out.println("Biggest prime number is "+bnum+"\n");
            break;
        }
        }
        System.out.println("\nThank you for using this calculator\n");
    }
}
