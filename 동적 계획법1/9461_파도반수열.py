import sys
input = sys.stdin.readline

result = [1, 1, 1, 2, 2] + [0] * 95

def wave(n):
    if n <= 4:
        return result[n]
    if result[n] != 0:
        return result[n]
    result[n] = wave(n-5) + wave(n-1)
    return result[n]
        

t = int(input())

for _ in range(t):
    n = int(input())
    print(wave(n-1))
