/*
Problem Description, Input, Output : http://codeforces.com/contest/1506/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class DominoWindowsill_Edu_106_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n,k1,k2;
            int w,b;

            n=sc.nextInt();
            k1=sc.nextInt();
            k2=sc.nextInt();
            w=sc.nextInt();
            b=sc.nextInt();

            int val1=(k1+k2)/2;
            int val2=((n-k1)+(n-k2))/2;

            if(val1>=w && val2>=b)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

        sc.close();
    }
}
