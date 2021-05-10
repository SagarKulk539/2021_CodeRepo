'''
Problem Description, Input, Output : https://codeforces.com/contest/1521/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    a,b=map(int,input().split())

    if b==1:
        print("NO")
    else:
        print("YES")
        print(f'{a*b} {a} {(b+1)*a}')
