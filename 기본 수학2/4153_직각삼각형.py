import sys
input = sys.stdin.readline

while True:
    temp = []
    a, b, c = map(int, input().split())
    
    if a == 0 and b == 0 and c == 0:
        break
    temp.append(a)
    temp.append(b)
    temp.append(c)
    
    temp.sort()
    if pow(temp[0], 2) + pow(temp[1], 2) == pow(temp[2], 2):
        print('right')
    else:
        print('wrong')
