import sys
input = sys.stdin.readline

n = input().rstrip()
l = []
for i in range(len(n)):
    l.append(int(n[i:i+1]))
l.sort()

for i in l[::-1]:
    print(i,end="")
