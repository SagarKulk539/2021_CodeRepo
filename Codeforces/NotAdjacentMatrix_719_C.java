/*
Problem Description, Input, Output : https://codeforces.com/contest/1520/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class NotAdjacentMatrix_719_C
{
    private static void printMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();

            if(n==2)
                System.out.println(-1);
            else
            {
                int val=1;
                int[][] matrix=new int[n][n];

                for(int i=0;i<n;i++)
                {
                    if(i%2==0)
                    {
                        for(int j=0;j<n;j+=2)
                        {
                            matrix[i][j]=val;
                            val++;
                        }
                    }
                    else
                    {
                        for(int j=1;j<n;j+=2)
                        {
                            matrix[i][j]=val;
                            val++;
                        }
                    }
                }

                for(int i=0;i<n;i++)
                {
                    if(i%2==0)
                    {
                        for(int j=1;j<n;j+=2)
                        {
                            matrix[i][j]=val;
                            val++;
                        }
                    }
                    else
                    {
                        for(int j=0;j<n;j+=2)
                        {
                            matrix[i][j]=val;
                            val++;
                        }
                    }
                }

                printMatrix(matrix);
            }
        }
        sc.close();
    }
}
