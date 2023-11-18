def invert(r, c):
    for i in range(r, r+3):
        for j in range(c, c+3):
            question[i][j] ^= 1

n, m = map(int, input().split())
question = [list(map(int, input())) for _ in range(n)]
answer = [list(map(int, input())) for _ in range(n)]
cnt = 0

for i in range(n-2):
    for j in range(m-2):
        if question[i][j] != answer[i][j]:
            cnt += 1
            invert(i, j)
print(cnt if question == answer else -1)