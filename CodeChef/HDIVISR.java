/*
Problem Description, Input, Output : https://www.codechef.com/FEB21C/problems/HDIVISR
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class HDIVISR
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=10;i>=1;i--)
        {
            if(n%i==0)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
	}
}
