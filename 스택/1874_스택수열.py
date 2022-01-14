import sys
input = sys.stdin.readline
n = int(input())

stack = []
result = []
index = 0
error = 0

for _ in range(n):
    num = int(input())
    while index < num:
        index += 1
        stack.append(index)
        result.append('+')
    if num == stack[-1]:
        stack.pop()
        result.append('-')
    else:
        error = 1

if error == 1:
    print('NO')
else:
    print('\n'.join(result))