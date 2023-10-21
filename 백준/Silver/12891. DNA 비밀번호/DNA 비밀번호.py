s, p = map(int, input().split())
long = input()
limit = list(map(int, input().split()))
cnt = {x:long[:p].count(x) for x in ['A', 'C', 'G', 'T']}
idx, ans = 0, 0
while idx <= s-p:
    k = 0
    for i, c in enumerate(['A', 'C', 'G', 'T']):
        if cnt[c] < limit[i]:
            k += limit[i] - cnt[c]
    
    if not k:
        k += 1
        ans += 1
    for i in range(k):
        if idx+p+i >= s:
            break
        cnt[long[idx+i]] -= 1
        cnt[long[idx+p+i]] +=1
    idx += k
print(ans)