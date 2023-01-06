import sys
input = sys.stdin.readline

n, m = map(int, input().split())
l = list(map(int, input().split()))

for _ in range(n-1):
    tmp = 0
    for i, k in enumerate(list(map(int, input().split()))):
        tmp += abs(k-l[i])
    if tmp > 2000:
        print('YES')
        exit(0)
print('NO')