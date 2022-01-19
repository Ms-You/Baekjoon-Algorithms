import sys
import bisect
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

result = [a[0]]

for i in range(n):
    if a[i] > result[-1]:
        result.append(a[i])
    else:
        idx = bisect.bisect_left(result, a[i])
        result[idx] = a[i]
        
print(len(result))
