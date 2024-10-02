import sys
input = sys.stdin.readline

h, w = map(int, input().split())
rg, rc, rp, cp = map(int, input().split())
arr = [list(input().strip()) for _ in range(h)]
cnt = 0
for r in range(h):
    for c in range(w):
        if arr[r][c] == 'P':
            cnt += 1
print(cnt < rp*cp and 1 or 0)