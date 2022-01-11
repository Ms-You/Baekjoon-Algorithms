import sys
input = sys.stdin.readline

l1 = []
l2 = []
for i in range(3):
    x, y = map(int, input().split())
    l1.append(x)
    l2.append(y)
l1.sort()
l2.sort()

result_x = 0
result_y = 0

if l1[0] == l1[1]:
    result_x = l1[2]
else:
    result_x = l1[0]

if l2[0] == l2[1]:
    result_y = l2[2]
else:
    result_y = l2[0]
    
print(result_x, result_y)