import sys
input = sys.stdin.readline

n, m = map(int, input().split())
input = list(map(int, input().split()))
sum = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if input[i] + input[j] + input[k] > m:
                continue
            else:
                sum = max(sum, input[i]+input[j]+input[k])
print(sum)
