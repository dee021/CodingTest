import sys
input = sys.stdin.readline

def sol():
    for i in range(n):
        for j in range(i+1, n):
            if c[i] != c[j] and abs(x[j] - x[i]) <= l[i] + l[j]:
                return i+1, j+1
    return

n = int(input())
x = list(map(int, input().split()))
l = list(map(int, input().split()))
c = list(input().strip().split())

res = sol()
if res:
    print('YES')
    print(*res)
else:
    print('NO')