import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = list(map(int, input().split()))
visited = [0 for _ in range(n)]
visited[0] = 1
for start in range(n-1):
    if visited[start] == 0:
        continue
    for end in range(start+1, n):
        
        if not visited[end] and (end-start) * (1 + abs(arr[start] - arr[end])) <= k:
            visited[end] = 1
            if end == n-1:
                break
    if visited[n-1]:
        break
print(visited[n-1] and 'YES' or 'NO')