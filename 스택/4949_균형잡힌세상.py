import sys
input = sys.stdin.readline

while True:
    n = input().rstrip()
    l = []
    if n == '.':
        break

    for i in n:
        if i == '(' or i == '[':
            l.append(i)
        elif i == ')':
            if len(l) != 0 and l[-1] == '(':
                l.pop()
            else:
                l.append(i)
        elif i == ']':
            if len(l) != 0 and l[-1] == '[':
                l.pop()
            else:
                l.append(i)
    if len(l) == 0:
        print('yes')
    else:
        print('no')