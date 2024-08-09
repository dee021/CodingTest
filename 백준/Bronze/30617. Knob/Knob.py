import sys
input = sys.stdin.readline

t = int(input())
knobs = [list(map(int, input().split())) for _ in range(t)]
ans = int(knobs[0][0] == knobs[0][1] != 0)

for i in range(1, t):
    ans += int(knobs[i][0] == knobs[i][1] != 0)
    ans += int(knobs[i][0] == knobs[i-1][0] != 0)
    ans += int(knobs[i][1] == knobs[i-1][1] != 0)
print(ans)