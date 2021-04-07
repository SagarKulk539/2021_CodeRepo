'''
Problem Description, Input, Output : https://www.codechef.com/APRIL21C/problems/SSCRIPT
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,f=map(int,input().split())
    str1=input()

    i=0

    mainFlag=0

    while i<n:
        count=0
        flag=0
        if str1[i]=='*':
            count+=1
            i+=1
            flag=1
            while i<n:
                if str1[i]!='*':
                    break
                else:
                    count+=1
                i+=1

        if count>=f:
            mainFlag=1
            break
        if flag==0:
            i+=1

    if mainFlag==1:
        print("YES")
    else:
        print("NO")
