def sol(cnt):
    l = len(s)
    ans = l
    double = s * 2
    idx = s.index('b')
    while cnt:
        ans = min(ans, b - double[idx:idx+b].count('b'))
        idx = idx + double[idx+1:].index('b') + 1
        cnt -= 1
    return ans

s = input()
b = s.count('b')
if b <= 1:
    ans = 0
else:
    ans = sol(b)
print(ans)