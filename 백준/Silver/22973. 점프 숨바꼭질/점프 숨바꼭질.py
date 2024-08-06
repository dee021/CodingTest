k = abs(int(input()))
ans = 0
cnt = 0
while cnt < k:
    ans += 1
    cnt <<= 1
    cnt += 1
if cnt == k:
    print(ans)
else:
    print(-1)