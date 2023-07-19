ans = [0]*3
n = int(input())
s = ('ABC'*(n//3+1))
c = ('BABC'*(n//4+1))
h = 'CCAABB'*(n//6+1)
for i, a in enumerate(input()):
    if a == s[i]:
        ans[0] += 1
    if a == c[i]:
        ans[1] += 1
    if a == h[i]:
        ans[2] += 1
m = max(ans)
print(m)
for i in range(3):
    if m == ans[i]:
        print(['Adrian', 'Bruno', 'Goran'][i])