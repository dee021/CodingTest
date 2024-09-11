r, c = map(int, input().split())
arr = [list(input().strip()) for _ in range(r)]

res = []
for i in range(r*2):
    if i < r:
        res.append(arr[i] + arr[i][::-1])
    else:
        res.append(arr[r-1-i] + arr[r-1-i][::-1])
n, m = map(int, input().split())
res[n-1][m-1] = '.#'[res[n-1][m-1] == '.']
for i in range(2*r):
    print(*res[i], sep='')