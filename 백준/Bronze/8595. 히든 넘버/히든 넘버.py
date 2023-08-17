k = ''
ans = 0
input()
for c in input():
    if c.isnumeric():
        k += c
    elif k:
        ans += int(k)
        k = ''
print(k and ans+int(k) or ans)