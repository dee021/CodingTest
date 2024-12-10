import sys
input = sys.stdin.readline

a, b, c = map(int, input().split())
ans = 0
for _ in range(int(input())):
    team = 0
    for _ in range(3):
        x, y, z = map(int, input().split())
        team += a*x + b*y + c*z
    ans = max(ans, team)
print(ans)