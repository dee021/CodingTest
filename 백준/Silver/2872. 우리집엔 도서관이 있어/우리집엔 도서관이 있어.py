import sys
input = sys.stdin.readline

n = int(input())
books = [int(input()) for _ in range(n)]
ans = 0

for b in books[::-1]:
    if b != n:
        ans += 1
    else:
        n -= 1
print(ans)