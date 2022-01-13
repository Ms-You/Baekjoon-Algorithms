from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
l = []
for i in range(n):
    l.append(int(input()))
l.sort()

print(round(sum(l)/n))
print(round(l[n//2]))
cnt_li = Counter(l).most_common()
if len(cnt_li) > 1 and cnt_li[0][1]==cnt_li[1][1]:
    print(cnt_li[1][0])
else:
    print(cnt_li[0][0])
print(max(l) - min(l))
