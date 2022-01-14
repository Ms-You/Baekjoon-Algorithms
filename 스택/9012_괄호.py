import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    ps = input().rstrip()
    up = 0
    for i in ps:
        if i == '(':
            up += 1
        elif i == ')':
            up -= 1
        if up < 0:
            print('NO')
            break
    if up > 0:
        print('NO')
    elif up == 0:
        print('YES')
