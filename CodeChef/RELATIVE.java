/*
Problem Description, Input, Output : https://www.codechef.com/JULY21C/problems/RELATIVE
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class RELATIVE
{
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          for(int k=0;k<t;k++)
          {
              int g=sc.nextInt();
              int c=sc.nextInt();

              int height=(int)Math.pow(c,2)/(2*g);
              System.out.println(height);
          }
          sc.close();
    }
}

