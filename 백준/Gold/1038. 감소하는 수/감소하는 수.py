def sol(l, s, cur):
    if len(cur) == l:
        nums.append(cur[::-1])
        return

    for p in range(max(map(int, cur))+1 if cur else 0, s):
        sol(l, s, cur+str(p))

n = int(input()) +1
cnt = [[1 for _ in range(10)]]
res = 10
if n <= 10:
    print(n-1)
    exit(0)
elif n >= 1024:
    print(-1)
    exit(0)
nums = []
for r in range(1, 10):
    cnt.append([0 for _ in range(10)])
    for c in range(r, 10):
        cnt[r][c] = cnt[r][c-1] + cnt[r-1][c-1]
        if res < n <= res + cnt[r][c]:
            sol(r, c, '')
            print(str(c)+sorted(nums)[n-res-1])
            break
        res += cnt[r][c]
    else:
        continue
    break