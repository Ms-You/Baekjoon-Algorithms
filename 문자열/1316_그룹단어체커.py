n = int(input())
count = 0

for _ in range(n):
    s = input()
    for i in range(1, len(s)):
        if s.index(s[i-1]) > s.index(s[i]):
            break
    else:
        count += 1

print(count)