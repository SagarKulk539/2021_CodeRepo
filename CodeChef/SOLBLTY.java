/*
Problem Description, Input, Output : https://www.codechef.com/MAY21C/problems/SOLBLTY
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class SOLBLTY
{
    public static void main (String[] args) throws java.lang.Exception
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int k=0;k<t;k++)
		{
			int x=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();

			int ans=(100-x)*b;
			ans+=a;
			ans*=10;

			System.out.println(ans);
		}
		sc.close();
    }
}
