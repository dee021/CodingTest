import sys
input = sys.stdin.readline

def sol(n):
    if n == 0:
        return
    for i in range(len(fibo)-1, 0, -1):
        if fibo[i] <= n:
            ans.append(fibo[i])
            sol(n-fibo[i])
            return

fibo = [0, 1]
while fibo[-1] < 10**9:
    fibo.append(fibo[-1]+fibo[-2])

for _ in range(int(input())):
    ans = []
    sol(int(input()))
    print(*sorted(ans))