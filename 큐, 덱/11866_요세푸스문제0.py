import sys
input = sys.stdin.readline

n, k = map(int, input().split())
range = [i for i in range(1, n+1)]
index = k - 1

print('<', end = "")
while len(range) > 0:
    index %= len(range)
    if len(range) > 1:
        print(range[index], end = ", ")
    else:
        print(range[index], end = "")
    del range[index]
    index += (k - 1)
print('>')
