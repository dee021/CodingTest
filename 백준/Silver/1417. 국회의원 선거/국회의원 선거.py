import sys
p = [0]
n = int(input())
dasom = int(input())
for i in range(n-1):
    p.append(int(sys.stdin.readline()))

ans = 0
while True:
    if dasom > max(p):
        break
    idx = p.index(max(p))
    dasom, p[idx] = dasom + 1, p[idx] - 1
    ans += 1
print(ans)
