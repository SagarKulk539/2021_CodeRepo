/*
Problem Description, Input, Output : https://www.codechef.com/APRIL21C/problems/BOLT
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class BOLT
{
    public static float roundFloat(float f, int places)
    {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(f));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.floatValue();
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);

          int t=sc.nextInt();
          for(int k=0;k<t;k++)
          {
              float k1,k2,k3,timeLimit;
              k1=sc.nextFloat();
              k2=sc.nextFloat();
              k3=sc.nextFloat();
              timeLimit=sc.nextFloat();

              float finalTime=100.0f/(k1*k2*k3*timeLimit);

              finalTime=roundFloat(finalTime,2);

              if(finalTime<9.58f)
                  System.out.println("YES");
              else
                  System.out.println("NO");
          }

          sc.close();
    }
}
