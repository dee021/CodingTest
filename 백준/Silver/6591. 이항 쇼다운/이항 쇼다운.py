import sys
input = sys.stdin.readline

while True:
    n, k = map(int, input().split())
    if n == 0 == k:
        break
    tmp1, tmp2 = 1, 1
    if k < n-k:
        for x in range(k):
            tmp1 *= n-x
            tmp2 *= k-x
    else:
        for x in range(n-k):
            tmp1 *= n-x
            tmp2 *= n-k-x
    print(tmp1//tmp2)