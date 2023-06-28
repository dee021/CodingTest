import sys
input = sys.stdin.readline

t = [int(input()) for _ in range(int(input()))]
ans = 0
for i, m in enumerate(sorted(t, reverse=True)):
    if m <= i:
        break
    ans += m-i
print(ans)