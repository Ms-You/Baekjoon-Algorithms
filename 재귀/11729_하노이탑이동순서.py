import sys
input = sys.stdin.readline

def hanoi(no, x, y):
    if no > 1:
        hanoi(no-1, x, 6-x-y)    
        
    print(x, y)
    
    if no > 1:
        hanoi(no-1, 6-x-y, y)

no = int(input())
print(2**no-1)
hanoi(no, 1, 3)
