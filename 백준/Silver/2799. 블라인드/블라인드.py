import sys
input = sys.stdin.readline

m, n = map(int, input().split())
ans = [0 for _ in range(5)]
windows = {'....':0, '*...':1, '**..':2, '***.':3, '****':4}

for f in range(m):
    input()
    w = ['' for _ in range(n)]
    for _ in range(4):
        blind = input().strip()
        for c in range(n):
            w[c] += blind[1+c+c*4]
    for c in range(n):
        ans[windows[w[c]]] += 1
print(*ans)