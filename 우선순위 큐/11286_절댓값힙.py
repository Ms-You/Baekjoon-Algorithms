import sys, heapq
input = sys.stdin.readline

hq = []
n = int(input())

for _ in range(n):
    x = int(input())
    if x != 0:
        heapq.heappush(hq, (abs(x), x))
    else:
        print(heapq.heappop(hq)[1] if hq else 0)
