import sys
input = sys.stdin.readline

a, b = input().rstrip().split()
a, b = int(a[::-1]), int(b[::-1])
print(max(a, b))