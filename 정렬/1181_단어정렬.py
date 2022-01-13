import sys
input = sys.stdin.readline

n = int(input())
l = []
for _ in range(n):
    word = input().rstrip()
    cnt = len(word)
    l.append((word, cnt))

l = list(set(l))
l.sort(key=lambda x: (x[1], x[0]))

for i in l:
    print(i[0])
