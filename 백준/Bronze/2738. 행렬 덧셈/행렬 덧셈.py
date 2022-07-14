n, m = map(int, input().split())

matrix = []
res = [0 for _ in range(n*m)]
for i in range(n*2):
    matrix.extend(list(map(int, input().split())))

for i in range(1,n*m+1):
    res[i-1] = matrix[i-1] + matrix[n * m + i - 1]
    if i % m == 0:
        print(' '.join([str(x) for x in res[i-m:i]]))
