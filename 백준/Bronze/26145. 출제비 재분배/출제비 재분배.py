import sys
input = sys.stdin.readline

n, m = map(int, input().split())
s = list(map(int, input().split()))
t = [list(map(int, input().split())) for _ in range(n)]
tt = [sum(x) for x in zip(*t)] # t 전치
t = [sum(x) for x in t]

print(*[s[i]-t[i]+tt[i] for i in range(n)], *tt[n:])