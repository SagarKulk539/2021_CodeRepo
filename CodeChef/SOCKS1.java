/*
Problem Description, Input, Output : https://www.codechef.com/APRIL21C/problems/SOCKS1
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class SOCKS1
{
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);
          int a,b,c;
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();

          int[] countArray=new int[11];
          countArray[a]++;
          countArray[b]++;
          countArray[c]++;

          int flag=0;
          for(int i=1;i<=10;i++)
          {
              if(countArray[i]>1)
              {
                  flag=1;
                  break;
              }
          }

          if(flag==0)
              System.out.println("NO");
          else
              System.out.println("YES");

          sc.close();
    }
}
