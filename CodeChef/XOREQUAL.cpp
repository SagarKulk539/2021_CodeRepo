/*
Problem Description, Input, Output : https://www.codechef.com/MAY21C/problems/XOREQUAL
Code by : Sagar Kulkarni
*/

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

long long int powerFunc(long long xVar, unsigned int yVar, long long int pVar)
{
    long long int result=1;
    xVar=xVar%pVar;

    if(xVar==0) 
          return 0;

    while(yVar>0)
    {
      if(yVar&1)
        result=(result*xVar)%pVar;

      yVar=yVar>>1;
      xVar=(xVar*xVar)%pVar;
    }
    return result;
}


int main() 
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin>>t;
    
    for(int k=0;k<t;k++)
    {
        int n;
        cin>>n;
        
        long long int ans=powerFunc(2,n-1,(long long int)pow(10,9)+7);
        
        cout<<ans<<"\n";
        
    }
    
    return 0;
}
