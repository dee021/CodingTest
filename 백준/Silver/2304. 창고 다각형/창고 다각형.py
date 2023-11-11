n = int(input())
arr = sorted([list(map(int, input().split())) for _ in range(n)])
ans = [0 for _ in range(arr[-1][0]-arr[0][0]+1)]
c = arr[0][0]
M = max([list(x) for x in zip(*arr)][1])
idx, h, i = 0, 0, 0
while idx < len(ans):
    if idx == arr[i][0] - c:
        h = max(h, arr[i][1])
        i += 1
    ans[idx] = h
    idx += 1
idx -= 1; i -= 1; h = 0
while idx >= 0 and h < M:
    if idx == arr[i][0] - c:
        h = max(h, arr[i][1])
        i -= 1
    ans[idx] = h
    idx -= 1
    
print(sum(ans))