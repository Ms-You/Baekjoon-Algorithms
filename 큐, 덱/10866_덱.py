from collections import deque
import sys
input = sys.stdin.realind

def empty():
    if len(d) == 0:
        return 1
    else:
        return 0

n = int(input())
d = deque()

for _ in range(n):
    ins = list(input().split())

    if ins[0] == "push_front":
        d.appendleft(ins[1])
    elif ins[0] == "push_back":
        d.append(ins[1])
    elif ins[0] == "pop_front":
        if empty() == 1:
            print(-1)
        else:
            print(d.popleft())
    elif ins[0] == "pop_back":
        if empty() == 1:
            print(-1)
        else:
            print(d.pop())
    elif ins[0] == "size":
        print(len(d))
    elif ins[0] == "empty":
        print(empty())
    elif ins[0] == "front":
        if empty() == 1:
            print(-1)
        else:
            print(d[0])
    elif ins[0] == "back":
        if empty() == 1:
            print(-1)
        else:
            print(d[len(d)-1])
