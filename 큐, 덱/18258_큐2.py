import sys
input = sys.stdin.readline

n = int(input())
que = []
idx = 0

for _ in range(n):
    word = input().rstrip().split()
    if word[0] == 'push':
        que.append(word[1])
    elif word[0] == 'pop':
        if len(que) > idx:
            print(que[idx])
            idx += 1
        else:
            print('-1')
    elif word[0] == 'size':
        print(len(que) - idx)
    elif word[0] == 'empty':
        if len(que) == idx:
            print('1')
            idx = 0
            que = []
        else:
            print('0')
    elif word[0] == 'front':
        if len(que) > idx:
            print(que[idx])
        else:
            print('-1')
    elif word[0] == 'back':
        if len(que) > idx:
            print(que[-1])
        else:
            print('-1')
