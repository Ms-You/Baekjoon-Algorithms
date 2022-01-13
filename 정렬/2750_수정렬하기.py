import sys
input = sys.stdin.readline

n = int(input())
l = []
for i in range(n):
    l.append(int(input()))

for i in range(n):
    for j in range(i+1, n):
        if l[i] > l[j]:
            l[i], l[j] = l[j], l[i]
for i in l:
    print(i)