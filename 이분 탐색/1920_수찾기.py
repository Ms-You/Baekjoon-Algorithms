import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
m = int(input())
is_input_a = list(map(int, input().split()))

a.sort()

def binary_search(target):
    start = 0
    end = n - 1
    while start <= end:
        mid = (start + end) // 2
        
        if target == a[mid]:
            return True
        elif target < a[mid]:
            end = mid - 1
        else:
            start = mid + 1

for i in is_input_a:
    if binary_search(i):
        print(1)
    else:
        print(0)
