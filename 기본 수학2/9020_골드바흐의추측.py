import sys
input = sys.stdin.readline

num = int(input())

while(num > 0):
    num -= 1
    n = int(input())
    a = [False,False] + [True]*(n-1)
    primes=[]

    for i in range(2,n+1):
        if a[i]:
            primes.append(i)
            for j in range(2*i, n+1, i):
                a[j] = False
    sub = n
    result = 0
    for i in primes:
        if n - i in primes:
            if sub > abs((n-2*i)):
                sub = (n - 2*i)
                result = i

    print(result, n - result)
