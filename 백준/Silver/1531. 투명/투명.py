import sys
input = sys.stdin.readline

picture = [[0 for _ in range(101)] for _ in range(101)]
ans = 0
n, m = map(int, input().split())
for _ in range(n):
    sr, sc, er, ec = map(int, input().split())
    for r in range(sr, er+1):
        for c in range(sc, ec+1):
            picture[r][c] += 1
            if picture[r][c] == m+1:
                ans += 1
print(ans)