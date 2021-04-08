'''
Problem Description, Input, Output : http://codeforces.com/contest/1504/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())

    a=input()
    b=input()

    list1=list(a)
    list2=list(b)

    countZero=0
    countOne=0

    indexStart=0

    for i in range(n):
        if list1[i]=='0':
            countZero+=1
        else:
            countOne+=1

        if countZero==countOne:
            if indexStart<n:
                if list1[indexStart]!=list2[indexStart]:
                    for j in range(indexStart,i+1):
                        if list1[j]=='0':
                            list1[j]='1'
                        else:
                            list1[j]='0'

            indexStart=i+1
            countOne=0
            countZero=0

    str1="".join(list1)
    str2="".join(list2)

    if str1==str2:
        print("YES")
    else:
        print("NO")
