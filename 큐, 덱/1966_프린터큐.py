import sys
input = sys.stdin.readline

num = int(input())

for _ in range(num):
    size, loc = map(int, input().split())
    imp = list(map(int, input().split()))
    cnt = 0
    
    imp_array = [0] * size
    imp_array[loc] = 1
    
    while True:
        if imp[0] == max(imp):
            cnt += 1
            if imp_array[0] == 1:
                print(cnt)
                break
            else:
                del imp[0]
                del imp_array[0]
        else:
            imp.append(imp[0])
            del imp[0]
            imp_array.append(imp_array[0])
            del imp_array[0]
