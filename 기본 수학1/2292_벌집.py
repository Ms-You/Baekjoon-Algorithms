import sys
input = sys.stdin.readline

n = int(input())
start = 1
cnt = 1

while start < n:
    start += 6*cnt
    cnt += 1
print(cnt)