import sys
input = sys.stdin.readline

for _ in range(int(input())):
    m, n = map(int, input().split())
    arr = [list(x) for x in zip(*[list(map(int, input().split())) for _ in range(m)])]
    ans = 0
    for col in arr:
        l = m -1
        while l >= 0 and col[:l+1].count(1):
            if not col[l]:
                for i in range(l, -1, -1):
                    if col[i]:
                        ans += l - i
                        col[i], col[l] = col[l], col[i]
                        break
            l -= 1
    print(ans)