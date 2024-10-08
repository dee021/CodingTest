conv = lambda x: int(x) if x.isnumeric() else x

color = []
num = []
for _ in range(5):
    c, n = map(conv, input().strip().split())
    color.append(c)
    num.append(n)
num.sort()
cnt = [[] for _ in range(6)]
for n in list(set(num)):
    cnt[num.count(n)].append(n)
seq = len(set(num)) == 5 and max(num) - min(num) == 4

ans = 0
if len(set(color)) == 1 and seq:
    ans = max(num) + 900  
elif len(set(num)) == 2 and cnt[4]:
    ans = 800 + cnt[4][0]
elif len(set(num)) == 2 and cnt[3] and cnt[2]:
    ans = cnt[3][0] * 10 + cnt[2][0] + 700
elif len(set(color)) == 1:
    ans = max(num) + 600
elif seq:
    ans = max(num) + 500
elif len(set(num)) == 3 and cnt[3]:
    ans = cnt[3][0] + 400
elif len(cnt[2]) == 2:
    ans = max(cnt[2]) * 10 + min(cnt[2]) + 300
elif cnt[2]:
    ans = cnt[2][0] + 200
else:
    ans = max(num) + 100
print(ans)