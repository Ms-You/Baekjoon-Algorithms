import sys, heapq
input = sys.stdin.readline

hq_left = []
hq_right = []

n = int(input())

for _ in range(n):
    x = int(input())    
    if len(hq_left) == len(hq_right):
        heapq.heappush(hq_left, (-x, x))
    else:
        heapq.heappush(hq_right, (x, x))
    
    if hq_right and hq_left[0][1] > hq_right[0][1]:
        left_max = heapq.heappop(hq_left)[1]
        right_min = heapq.heappop(hq_right)[1]
        heapq.heappush(hq_left, (-right_min, right_min))
        heapq.heappush(hq_right, (left_max, left_max))
        
    print(hq_left[0][1])
