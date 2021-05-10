/*
Problem Description, Input, Output : https://codeforces.com/contest/1520/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class OrdinaryNumbers_719_B
{
    private static int countDigits(int n)
    {
        int count=0;

        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }

    private static int getNumber(int count)
    {
        int num=1;
        int var1=10;

        while(count!=0)
        {
            num+=var1;
            var1*=10;
            count--;
        }
        return num;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();

            if(n>=1 && n<=9)
                System.out.println(n);
            else
            {
                int count=countDigits(n);

                int finalVal1=(count-2)*9;

                int num=getNumber(count-1);

                int finalVal2=0;
                for(int j=num;;j+=num)
                {
                    if(j>n)
                        break;
                    finalVal2++;
                }

                System.out.println(finalVal1+finalVal2+9);
            }
        }
        sc.close();
    }
}
