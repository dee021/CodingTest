import sys
input = sys.stdin.readline

def sol():
    for s in range(m):
        if data[s] == reality[0]:
            for l in range(1, m-s):
                k = s
                idx = 0
                while (k + l) < m and (idx + 1) < n and reality[idx + 1] == data[k + l]:
                    idx += 1
                    k += l
                if idx == n - 1:
                    ans.add(l-1)

n = int(input())
reality = list(map(int, input().split()))
m = int(input())
data = list(map(int, input().split()))
ans = set()
sol()
if ans:
    print(min(ans), max(ans))
else:
    print(-1)