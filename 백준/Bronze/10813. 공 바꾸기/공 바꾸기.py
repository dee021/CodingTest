n, m = map(int, input().split())
b = [x for x in range(1, n+1)]
for _ in range(m):
    i, j = map(int, input().split())
    i, j = i-1, j-1
    tmp = b[i]
    b[i] = b[j]
    b[j] = tmp
print(*b)