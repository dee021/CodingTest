n = int(input())
k = n // 3
ans = 0

for a in range(1, int(k/3)+2):
    for b in range(a, k-1):
        if a <= b <= k-a-b:
            ans += [1,3,6][len(set([a, b, k-a-b]))-1]
        if not all([a, b, k-a-b]):
            break
print(ans)