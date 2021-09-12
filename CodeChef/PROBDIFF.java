/*
Problem Description, Input, Output : https://www.codechef.com/AUG21C/problems/PROBDIFF
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PROBDIFF
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int[] values=new int[11];

            int a1=sc.nextInt();
            values[a1]++;

            int a2=sc.nextInt();
            values[a2]++;

            int a3=sc.nextInt();
            values[a3]++;

            int a4=sc.nextInt();
            values[a4]++;

            int result=1;
            for(int i=1;i<11;i++)
            {
                if(values[i]==2)
                {
                    result=2;
                    break;
                }
                else if(values[i]==3)
                {
                    result=3;
                    break;
                }
                else if(values[i]==4)
                {
                    result=4;
                    break;
                }
            }

            if(result==1)
                System.out.println(2);
            else if(result==2)
                System.out.println(2);
            else if(result==3)
                System.out.println(1);
            else if(result==4)
                System.out.println(0);
        }
        sc.close();
    }
}
