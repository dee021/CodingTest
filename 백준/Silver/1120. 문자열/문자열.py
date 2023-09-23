def sol(a, b):
    rt = 0
    for i in range(len(a)):
        rt += a[i] != b[i]
    return rt

a, b = input().split()
i, ans = len(a), len(b)

for s in range(len(b)-i+1): # start index of b 
    tmp = sol(a, b[s:s+i])
    if ans > tmp:
        ans = tmp
print(ans)