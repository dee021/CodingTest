h, w = map(int, input().split())
memo = [list(input().strip()) for _ in range(h)]
ans = 0

for r in range(h):
    flag = 0
    for c in range(w):
        if memo[r][c] == '.' and flag:
            ans += 1
        elif memo[r][c] != '.' and flag:
            flag = 0
            ans += 0.5
        elif memo[r][c] != '.' and not flag:
            flag = 1
            ans += 0.5
print(int(ans))