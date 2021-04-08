/*
Problem Description, Input, Output : http://codeforces.com/contest/1506/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class StrangeTable_710_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            long n,m,x;
            n=sc.nextLong();
            m=sc.nextLong();
            x=sc.nextLong();

            long col=(x-1)/n;
            long row=(x-1)%n;

            long ans=(row*m)+(col+1);
            System.out.println(ans);
        }

        sc.close();
    }
}
