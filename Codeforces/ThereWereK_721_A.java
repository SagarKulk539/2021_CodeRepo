/*
Problem Description, Input, Output : https://codeforces.com/contest/1527/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ThereWereK_721_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            if(n==1)
                System.out.println(0);
            else
            {
                int result=(int)(Math.log(n)/Math.log(2));

                System.out.println((int)Math.pow(2,result)-1);
            }

        }
        sc.close();
    }
}
