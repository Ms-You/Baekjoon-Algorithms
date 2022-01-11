import sys
input = sys.stdin.readline

s = input().rstrip()
li = 'c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='
count = 0

for i in li:
    if i in s:
        count += s.count(i)
        s = s.replace(i, " ")

s = s.replace(" ","")

count += len(s)
print(count)
