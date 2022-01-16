import sys
input = sys.stdin.readline

n = int(input())
t = 2

while True:
    if n == 1 or n == 2:
        print(n)
        break
    t *= 2
    
    if t >= n:
        print((n - t//2) * 2)
        break
