s = input().strip()
x = []
ans = 0
for i in range(len(s)-1):
    if s[i:i+2] == '((':
        x.append(0)
    elif s[i:i+2] == '))':
        ans += len(x)
print(ans)