import sys
input = sys.stdin.readline

def sol(start, end, visited):
    if cnt[end][0]:
        cnt[start] = [bin(cnt[end][1] | visited).count('1'), cnt[end][1] | visited]
        return
    if visited & (1<<(end-1)):
        cnt[start] = [bin(visited).count('1'), visited]
        return
    sol(start, nodes[end], visited | (1<<(end-1)))

n = int(input())
nodes = [0] + [int(input()) for _ in range(n)]
cnt = [[0,0] for _ in range(n+1)]
ans = 0

for i in range(1, n+1):
    if not cnt[i][0]:
        sol(i, nodes[i], 1<<(i-1))
    if cnt[ans][0] < cnt[i][0]:
        ans = i
print(ans)