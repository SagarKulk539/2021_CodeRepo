'''
Problem Description, Input, Output : http://codeforces.com/contest/1504/problem/A
Code by : Sagar Kulkarni
'''

def isPalindrome(str1):
    return str1==str1[::-1]

for _ in range(int(input())):
    str1=input()

    str2='a'+str1
    str3=str1+'a'

    truth1=isPalindrome(str2)
    truth2=isPalindrome(str3)

    if truth1 and truth2:
        print("NO")
    else:
        print("YES")
        if truth1:
            print(str3)
        else:
            print(str2)
