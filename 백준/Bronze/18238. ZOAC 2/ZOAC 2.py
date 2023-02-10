s = input()
ans, l = 0, 'A'
for c in s:
    tmp = abs(ord(c)-ord(l))
    ans += min(tmp, 26-tmp)
    l = c
print(ans)