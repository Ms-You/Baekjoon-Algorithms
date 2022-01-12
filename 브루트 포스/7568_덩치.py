import sys
input = sys.stdin.readline

n = int(input())
kg = []
cm = []
for i in range(n):
    x, y = map(int, input().split())
    kg.append(x)
    cm.append(y)

rank = []
for i in range(n):
    number = 1
    for j in range(n):
        if kg[i] < kg[j] and cm[i] < cm[j]:
            number += 1
        else:
            continue
    rank.append(number)

for i in rank:
    print(i, end = ' ')