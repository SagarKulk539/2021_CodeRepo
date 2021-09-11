'''
Problem Description, Input, Output : https://www.codechef.com/JUNE21C/problems/CHFHEIST
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    D,d,P,Q=map(int,input().split())

    totalMoney=D*P

    terms=(D//d)
    remainingDays=D%d
    totalMoney+=remainingDays*terms*Q


    sumT=(terms-1)*(terms)
    sumT//=2

    totalMoney+=sumT*d*Q

    print(int(totalMoney))
