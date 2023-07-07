n = int(input())
a, b = map(int, input().split())
c = int(input())
arr = [int(input()) for _ in range(n)]
ans, s, p = c/a, c, a
for i, c in enumerate(sorted(arr, reverse=True), 1):
    s += c; p+= b
    ans = max(ans, s/p)
print(int(ans))