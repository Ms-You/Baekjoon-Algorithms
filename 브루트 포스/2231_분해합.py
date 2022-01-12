import sys
input = sys.stdin.readline

# 1번 풀이
# n = int(input())

# for i in range(n):
#     sum = i
#     for j in range(len(str(i))):
#         sum += int(str(i)[j: j+1])
        
#     if sum == n:
#         print(i)
#         break
# else:
#     print(0)


# 2번 풀이
n = int(input())

for i in range(1, n+1):
  result = i + sum(map(int, str(i)))
  
  if result == n:
    print(i)
    break

  if i == n:
    print(0)
