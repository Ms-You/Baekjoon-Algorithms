import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    a, b = input().rstrip().split()
    for i in b:
        print(i*int(a), end = "")
    print()