import sys
input = sys.stdin.readline

ans = 0
s = [0 for _ in range(13)]
n, k = map(int, input().split())
for _ in range(n):
    g, y = map(int, input().split())
    s[6*g+y] += 1
for i in range(1,13):
    ans += s[i]//k + 1 if s[i]%k else s[i]//k
print(ans)