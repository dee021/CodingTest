import heapq

def sol(n, k):
    if n == k:
        return 0
    visited[n] = 1
    path = [[0,n]]
    while path:
        sec, cur = heapq.heappop(path)
        for p, s in [[cur * 2, sec], [cur + 1, sec + 1], [cur - 1, sec + 1]]:
            if 0 <= p <= 100000 and not visited[p]:
                heapq.heappush(path, [s, p])
                visited[p] = 1
                if p == k:
                    return s

visited = [0 for _ in range(100001)]
n, k = map(int, input().split())
print(sol(n, k))