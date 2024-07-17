board = {}
color = 0
for r in range(8):
    color ^= 1
    for c in range(8):
        board[chr(c + ord('A')) + str(r+1)] = color
        board[r*8 + c +1] = color
        color ^= 1

for _ in range(int(input())):
    a, b = input().strip().split()
    print(board[a] == board[int(b)] and 'YES' or 'NO')
