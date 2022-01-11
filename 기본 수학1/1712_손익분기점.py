import sys
input = sys.stdin.readline

a, b, c = map(int, input().split())
count = 0

if b < c:
    adv = c - b
    count += a // adv + 1
else:
    count = -1

print(count)