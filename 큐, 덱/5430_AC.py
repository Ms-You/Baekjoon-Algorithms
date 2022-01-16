import sys
import re
input = sys.stdin.readline

testCase = int(input())
for _ in range(testCase):
    p = list(input())
    n = int(input())
    x = input()
    x = list(map(int, re.findall(r'\d+', x)))
    
    end = 0
    error = 0

    for i in p:
        if i == 'R':
            end += 1
        elif i == 'D':
            if len(x) == 0:
                error = 1
                break
            else:
                if end % 2 == 0:
                    del x[0]
                else:
                    del x[len(x)-1]
    if error == 1:
        print('error')
    else:
        if end % 2 == 0:
            print(str(x).replace(' ', ''))
        else:
            x.reverse()
            print(str(x).replace(' ', ''))
