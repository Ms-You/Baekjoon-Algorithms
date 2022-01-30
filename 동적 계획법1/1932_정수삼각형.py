import sys
input = sys.stdin.readline

n = int(input())
dp = []
for _ in range(n):
    dp.append(list(map(int, input().split())))

for i in range(1, n):
    for j in range(i+1):
        if j == 0: # 맨 왼쪽라인은 단순히 위에 값을 더해줌
            dp[i][j] += dp[i-1][j]
        elif i == j: # 맨 오른쪽 라인도 단순히 위에 값을 더해줌
            dp[i][j] += dp[i-1][j-1]
        else: # 중간에 있는 값들은 왼쪽과 오른쪽 위에 있는 값들중 더 큰 값을 골라 더해줌
            dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + dp[i][j]
            
print(max(dp[n-1]))
