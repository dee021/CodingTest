n, k = map(int, input().split())
char = list(int(input()) for _ in range(n))
l, r = min(char), max(char) + k # range(목표레벨)

while l <= r:
    res = 0
    mid = (l + r) // 2
    for i in range(n):
        if char[i] < mid:
            res += mid - char[i]
    if k >= res:
        l = mid + 1
    else:
        r = mid - 1
print(r)