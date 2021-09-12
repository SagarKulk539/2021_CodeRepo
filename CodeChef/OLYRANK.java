/*
Problem Description, Input, Output : https://www.codechef.com/AUG21C/problems/OLYRANK
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class OLYRANK
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int g1=sc.nextInt();
            int s1=sc.nextInt();
            int b1=sc.nextInt();
            int g2=sc.nextInt();
            int s2=sc.nextInt();
            int b2=sc.nextInt();

            long medalsCountry1=g1+s1+b1;
            long medalsCountry2=g2+s2+b2;

            if(medalsCountry1>medalsCountry2)
                System.out.println(1);
            else
                System.out.println(2);
        }
        sc.close();
    }
}
