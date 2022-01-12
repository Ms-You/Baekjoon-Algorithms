import sys
input = sys.stdin.readline

n, m = map(int, input().split())
board = []
for i in range(n):
    board.append(input())
new_board = []

for i in range(n-7):
    for j in range(m-7):
        first_w = 0
        first_b = 0
        for k in range(i, i+8):
            for l in range(j, j+8):
                if (k+l) % 2 == 0:
                    if board[k][l] != 'W':
                        first_w = first_w+1
                    if board[k][l] != 'B':
                        first_b = first_b+1
                else:
                    if board[k][l] != 'B':
                        first_w = first_w+1
                    if board[k][l] != 'W':
                        first_b = first_b+1
        new_board.append(first_w)
        new_board.append(first_b)

print(min(new_board))