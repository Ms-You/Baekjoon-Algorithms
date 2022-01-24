import sys
input = sys.stdin.readline

result = [0]*1000001

n = int(input())
result[0] = 1
result[1] = 2

for i in range(2, n+1):
    result[i] = (result[i-1] + result[i-2]) % 15746
print(result[n-1])
