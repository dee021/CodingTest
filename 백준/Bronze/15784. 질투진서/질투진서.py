import sys
input = sys.stdin.readline

n, r, c = map(int, input().split())
r -=1; c-=1
arr = [list(map(int, input().split())) for _ in range(n)]
j = arr[r][c]
ans = 'HAPPY'
for i in range(n):
    if arr[r][i] > j or arr[i][c] > j:
        ans = 'ANGRY'
        break
print(ans)