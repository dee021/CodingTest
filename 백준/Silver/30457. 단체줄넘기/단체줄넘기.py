n = int(input())
cnt = {}
ans = 0
for i in map(int, input().split()):
    cnt.setdefault(i, 0)
    if cnt[i] < 2:
        cnt[i] += 1
        ans += 1
print(ans)