import sys
input = sys.stdin.readline

p = [[0 for _ in range(100)] for _ in range(100)]
ans = 0
for _ in range(int(input())):
    w, h = map(int, input().split())
    for i in range(10):
        for j in range(10):
            if p[h+i][w+j] == 0:
                p[h+i][w+j] = 1
                ans += 1
print(ans)