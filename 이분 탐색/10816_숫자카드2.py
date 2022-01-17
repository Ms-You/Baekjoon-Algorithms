from bisect import bisect_left, bisect_right
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
a.sort()

m = int(input())
cnt_a = list(map(int, input().split()))

def binary_search(start, end):
    start_index = bisect_left(a, start)
    end_index = bisect_right(a, end)
    return end_index - start_index

for i in cnt_a:
    print(binary_search(i, i), end = ' ')
