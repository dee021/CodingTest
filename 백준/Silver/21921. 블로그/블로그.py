n, x = map(int, input().split())
visit = list(map(int, input().split()))
l, r = 0, x
s = sum(visit[l:r])
ans, cnt = s, 1
while r < n:
    s += visit[r] - visit[l]
    if s == ans:
        cnt += 1
    elif s > ans:
        cnt = 1
        ans = s
    l += 1; r += 1
print(ans or 'SAD')
if ans:
    print(cnt)