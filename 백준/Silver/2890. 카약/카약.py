r, c = map(int, input().split())
ans = [0 for _ in range(9)]
b = set(range(1,10))

for _ in range(r):
    if not b:
        break
    l = input()
    for i in list(b):
        if str(i*111) in l:
            ans[i-1] = len(l.split(str(i*111))[1])
            b.remove(i)
            
print(*[sorted(set(ans)).index(x)+1 for x in ans], sep='\n')