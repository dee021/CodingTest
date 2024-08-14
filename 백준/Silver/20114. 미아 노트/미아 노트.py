import sys
input = sys.stdin.readline

def sol(y):
    for r in range(h):
        for c in range(y, y+w):
            if note[r][c].isalpha():
                return note[r][c]
    return '?'

n, h, w = map(int, input().split())
note = [list(input().strip()) for _ in range(n)]
ans = ''

for c in range(0, n*w, w):
    ans += sol(c)
print(ans)