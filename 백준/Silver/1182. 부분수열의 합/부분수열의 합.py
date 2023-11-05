import sys
input = sys.stdin.readline

def sol(visited, res):
    global ans
    if mem[visited] == '' or visited == 0:
        if visited and res == s:
            ans += 1
        mem[visited] = res
        
    for i in range(n):
        if mem[visited|(1<<i)] == '':
            sol(visited|(1<<i), mem[visited] + arr[i])

ans = 0
n, s = map(int, input().split())
mem = ['' for _ in range((1<<n))]
mem[0] = 0
arr = list(map(int, input().split()))
sol(0, 0)
print(ans)