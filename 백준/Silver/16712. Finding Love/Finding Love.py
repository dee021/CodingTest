from bisect import insort_right
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))
vs = list(map(int, input().split()))
tmp = sorted(arr[:m])

for i in range(m, n):
    del tmp[vs[i-m]-1]
    insort_right(tmp, arr[i])
del tmp[vs[-1]-1]
print(*tmp)