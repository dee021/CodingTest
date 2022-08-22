n, k = map(int, input().split())
arr = [x for x in range(1, n+1) if x != k]
ans = [str(k)]; idx = k -1

for i in range(1, n, 1):
    idx = (idx + k - 1)%len(arr)
    ans.append(str(arr.pop(idx)))

print('<{0}>'.format(', '.join(ans)))
