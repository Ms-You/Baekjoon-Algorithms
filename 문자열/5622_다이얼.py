import sys
input = sys.stdin.readline

s = input().rstrip().upper()
li = []
dic = {}
idx = 1
count = 0

for i in range(65,91):
    if i == 83 or i == 90:
        count -=1
    if count % 3 == 0:
        idx += 1
    dic[chr(i)] = idx
    count+=1

for i in s:
    li.append(i)

count = 0
for i in li:
    count += dic[i]+1

print(count)
