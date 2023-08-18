f = input()
ans = 1
for i, c in enumerate(f):
    if c == 'd':
        ans *= [10,9][i and c == f[i-1]]
    else:
        ans *= [26, 25][i and c == f[i-1]]
print(ans)