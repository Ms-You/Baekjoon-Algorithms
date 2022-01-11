import sys
input = sys.stdin.readline

s = input().rstrip()
alpha = [-1]*26

for i in range(len(s)):
    if alpha[ord(s[i]) - 97] != -1:
        continue
    else:
        alpha[ord(s[i]) - 97] = i

for i in alpha:
    print(i, end = ' ')