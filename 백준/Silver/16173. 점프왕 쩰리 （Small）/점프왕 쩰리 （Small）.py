def sol(start, end):
    r, c = start
    if r > end or c > end or not w[r][c]:
        return False
    if w[r][c] == -1:
        return True
    down = sol((r+w[r][c], c), end)
    right = sol((r, c+w[r][c]), end)
    if down or right:
        return True
    return False

e = int(input())
w = [list(map(int, input().split())) for _ in range(e)]
print('HaruHaru' if sol((0,0), e-1) else 'Hing')