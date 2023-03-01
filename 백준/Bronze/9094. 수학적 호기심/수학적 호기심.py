ans = [([-1] if i > 2 else [0])*101 for i in range(101)]

def sol(n, m):
    if ans[n][m] != -1:
        return ans[n][m]
    ans[n][m] = sol(n-1, m)
    a = n-1
    for b in range(1, a):
        ans[n][m] += bool((a**2+b**2+m) % (a*b) == 0)
    return ans[n][m]

for _ in range(int(input())):
    n, m = map(int, input().split())
    print(sol(n, m))