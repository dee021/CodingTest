import sys
input = sys.stdin.readline

def sol(v):
    global ans
    visited[v] = 1
    while True:
        v = arr[v]
        if visited[v]:
            ans += 1
            return
        visited[v] = 1

for _ in range(int(input())):
    ans, v = 0, 1
    n = int(input())
    visited = [0 for _ in range(n+1)]
    visited[0] = 1
    arr = list(map(int, input().split()))
    arr.insert(0, 0)
    while not all(visited) and v <= n:
        if not visited[v]:
            sol(v)
        v += 1
    print(ans)