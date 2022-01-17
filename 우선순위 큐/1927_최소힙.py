import sys, heapq
input = sys.stdin.readline

hq = []
n = int(input())

for _ in range(n):
    x = int(input())
    if x != 0:
        heapq.heappush(hq, x)
    else:
        print(heapq.heappop(hq) if hq else 0)
