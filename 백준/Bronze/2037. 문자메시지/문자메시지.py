tmp = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
apb = [0]
for i in range(ord('B'), ord('Z')+1):
    if tmp[apb[-1]].count(chr(i)):
        apb.append(apb[-1])
    else:
        apb.append(apb[-1]+1)
p, w = map(int, input().split())
d = {chr(c):p+list(filter(lambda x: x.count(chr(c)), tmp))[0].index(chr(c))*p for c in range(ord('A'), ord('Z')+1)}

ans = 0
bf = 32
s = input()
for i, c in enumerate(s):
    if c.isalpha():
        ans += d[c]
        if (i and bf == apb[ord(c)-65]):
            ans += w
        bf = apb[ord(c)-65]
    else: # c == ' '
        ans += p
        bf = 32
print(ans)