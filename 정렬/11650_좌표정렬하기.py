import sys
input = sys.stdin.readline

n = int(input())

l = []
for i in range(n):
    l.append(list(map(int, input().split())))

l.sort(key=lambda x: (x[0], x[1]))
for x, y in l:
    print(x, y)
