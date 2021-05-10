'''
Problem Description, Input, Output : https://codeforces.com/contest/1520/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    str1=input()

    list1=list(str1)

    currVal=list1[0]
    flag=0

    for i in range(1,n):
        if list1[i]!=currVal:
            if i+1<n:
                for j in range(i+1,n):
                    if list1[j]==currVal:
                        flag=1
                        break
            currVal=list1[i]
        if flag==1:
            break

    if flag==0:
        print("YES")
    else:
        print("NO")
