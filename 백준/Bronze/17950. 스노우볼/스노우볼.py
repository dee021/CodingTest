import sys
input = sys.stdin.readline

h, x = map(int, input().split())
ans = 0; D = 10**9 + 7; M = 1
for e in range(1, h+1):
    M *= x
    M %= D
    ans += int(input())*M
    ans %= D
print(ans)