import sys,math
input = sys.stdin.readline

r = int(input())
euclid = math.pi * r * r
taxi = r * 2 * r
print('{0:.6f}'.format(euclid))
print('{0:.6f}'.format(taxi))