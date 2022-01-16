from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
num = list(map(int, input().split()))
dq = deque(i for i in range(1, n+1))
cnt = 0

while True:
    if len(num) == 0:
        break
    if dq[0] == num[0]:
        dq.popleft()
        del num[0]
    elif dq.index(num[0]) <= len(dq)//2:
        dq.append(dq.popleft())
        cnt += 1
    else:
        dq.appendleft(dq.pop())
        cnt += 1
print(cnt)
