pn = 'O'.join(['I']*(int(input())+1))
sl, pl = int(input()), len(pn)
s = input()
ans = 0
for i in range(sl-len(pn)+1):
    if s[i:i+pl] == pn:
        ans += 1
print(ans)