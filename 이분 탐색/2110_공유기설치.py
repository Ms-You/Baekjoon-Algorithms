import sys
input = sys.stdin.readline

n, c = map(int, input().split())
x = [int(input()) for _ in range(n)]
x.sort()

start, end = 1, max(x)

while start <= end:
    mid = (start+end) // 2
    home = x[0]
    cnt = c-1
    
    for i in range(1, n):
        if x[i] >= home + mid:
            cnt -= 1
            home = x[i]
    
    if cnt <= 0:        
        start = mid + 1
    else:
        end = mid - 1
print(end)
    

