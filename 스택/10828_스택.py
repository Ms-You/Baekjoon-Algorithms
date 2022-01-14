import sys
input = sys.stdin.readline

n = int(input())
value = []

for i in range(n):
    word= input().rstrip().split()

    if word[0] == 'push':
        value.append(word[1])
    elif word[0] == 'pop':
        if len(value) <= 0:
            print('-1')
        else:
            print(value[len(value)-1])
            del value[len(value)-1]
    elif word[0] == 'size':
        print(len(value))
    elif word[0] == 'empty':
        if len(value) <= 0:
            print('1')
        else:
            print('0')
    else:
        if len(value) <= 0:
            print('-1')
        else:
            print(value[len(value)-1])
