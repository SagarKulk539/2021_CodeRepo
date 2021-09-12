/*
Problem Description, Input, Output : https://www.codechef.com/JULY21C/problems/EITA
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class EITA
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int d=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            int total;
            total=d*y+(7-d)*z;

            System.out.println(Math.max(total,7*x));

        }
        sc.close();
    }
}
