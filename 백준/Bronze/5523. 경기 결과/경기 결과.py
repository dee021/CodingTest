import sys
input = sys.stdin.readline

ans = [0,0]
for _ in range(int(input())):
    a, b = map(int, input().split())
    if a > b:
        ans[0] += 1
    elif a < b:
        ans[1] += 1
print(*ans)