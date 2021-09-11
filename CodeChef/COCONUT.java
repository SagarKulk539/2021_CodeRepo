/*
Problem Description, Input, Output : https://www.codechef.com/JUNE21C/problems/COCONUT
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class COCONUT
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int xa=sc.nextInt();
            int xb=sc.nextInt();
            int XA=sc.nextInt();
            int XB=sc.nextInt();

            System.out.println((XA/xa)+(XB/xb));

        }
        sc.close();
    }
}
