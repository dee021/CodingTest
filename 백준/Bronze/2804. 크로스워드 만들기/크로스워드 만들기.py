a, b = input().split()
for c in a:
    if c in b:
        i, j = a.index(c), b.index(c)
        break
ans = ['.'*(i)+b[x]+'.'*(len(a)-i-1) for x in range(len(b))]
ans[j] = a

print(*ans, sep='\n')