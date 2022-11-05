ans = 0; val = 100

for _ in range(7):
    t = int(input())
    if t%2 ==1:
        ans += t
        val = min(val, t)

if ans: print(ans, val, sep='\n')
else: print(-1)