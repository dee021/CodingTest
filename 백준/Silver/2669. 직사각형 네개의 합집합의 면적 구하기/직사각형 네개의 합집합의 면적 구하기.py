arr = [[0 for _ in range(101)] for _ in range(101)]
ans = 0
s = [list(map(int, input().split())) for _ in range(4)]

for a, b, c, d in s:
    for x in range(a, c):
        for y in range(b, d):
            if not arr[x][y]:
                ans += 1
                arr[x][y] = 1
print(ans)