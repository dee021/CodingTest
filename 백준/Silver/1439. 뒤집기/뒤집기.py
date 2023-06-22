replace = lambda x: '0' if x=='1' else '1'

ans = 0
s = list(input()); l = len(s)
t = s.copy()
while s.count('0') and t.count('1'):
    s[s.index('0'):l-s[::-1].index('0')] = list(map(replace, s[s.index('0'):l-s[::-1].index('0')]))
    t[t.index('1'):l-t[::-1].index('1')] = list(map(replace, t[t.index('1'):l-t[::-1].index('1')]))
    ans += 1
print(ans)