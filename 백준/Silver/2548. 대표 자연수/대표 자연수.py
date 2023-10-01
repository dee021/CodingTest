from collections import Counter

dif = lambda x: abs(k-x)*cnt[x]

n = int(input())
cnt = Counter(map(int, input().split()))
keys = sorted(cnt.keys())
k = keys[0]
s, d = sum(map(dif, keys)), k
ans = [s, k]
p = [0,cnt[k],n-cnt[k]]
for k in keys[1:]:
    d = k-d
    p = [p[0]+p[1], cnt[k], p[2]-cnt[k]]
    s = s + p[0]*d - (p[1] + p[2])*d
    if ans[0] > s:
        ans = [s, k]
    d = k
print(ans[1])
