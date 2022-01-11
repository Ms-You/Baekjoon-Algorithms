import sys, math
input = sys.stdin.readline

t = int(input())
while t > 0:
    t -= 1
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    a = math.sqrt(pow(x2-x1, 2) + pow(y2-y1, 2))
    l = [r1, r2, a]
    l.sort()
    if x1==x2 and y1==y2 and r1==r2:
        print(-1)
    elif (a == r1+r2) or (l[2] == l[0]+l[1]):
        print(1)
    elif l[2] > l[0] + l[1]:
        print(0)
    else:
        print(2)
