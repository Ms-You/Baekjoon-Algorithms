import sys
input = sys.stdin.readline

k, n = map(int, input().split())
line = [int(input()) for _ in range(k)]
start, end = 1, max(line)

while start <= end:
    mid = (start + end) // 2
    cnt_line = 0
    
    for i in line:
        cnt_line += i // mid
    
    if cnt_line >= n:
        start = mid + 1
    else:
        end = mid - 1
        
print(end)
    