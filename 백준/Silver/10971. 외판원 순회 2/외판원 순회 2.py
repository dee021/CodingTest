def sol(start, visited):
    if visited == ALLVISITED:
        return dists[start][0] or INF
    
    if dp[start][visited] != INF:
        return dp[start][visited]
    
    tmp = INF
    for end in range(n):
        if not (visited & 1 << end) and dists[start][end]:
            tmp = min(tmp, dists[start][end] + sol(end, visited | (1 << end)))
    dp[start][visited] = tmp
    return tmp

n = int(input())
INF = float('inf')
ALLVISITED = (1 << n)-1
dists = [list(map(int, input().split())) for _ in range(n)]
dp = [[INF for _ in range(1 << n)] for _ in range(n)]
print(sol(0, 1))