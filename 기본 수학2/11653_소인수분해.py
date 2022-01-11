import sys
input = sys.stdin.readline

num = int(input())
result = []
i = 1
while i*i < num:
    i += 1
    if num % i != 0:
        continue
    while num % i == 0:
        num /= i
        result.append(i)
        
if (num != 1):
    result.append(int(num))

for i in result:
    print(i)
