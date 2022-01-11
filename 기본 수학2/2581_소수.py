import sys
input = sys.stdin.readline

m = int(input())
n = int(input())

count = 0
min = n
sum = 0

for num in range(m, n+1):
    if num > 1:
        for i in range(2, num):
            if num % i == 0:
                break
        else:
            if min > num:
                min = num
            sum += num
            count += 1

if count == 0:
    print(-1)
else:
    print(sum)
    print(min)
