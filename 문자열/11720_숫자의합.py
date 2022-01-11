import sys
input = sys.stdin.readline

n = int(input())
num = input().rstrip()
sum = 0

for i in str(num):
    sum += int(i)
print(sum)