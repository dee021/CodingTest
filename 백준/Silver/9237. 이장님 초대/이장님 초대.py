ans = 0
n = int(input())
for d, t in enumerate(sorted(map(int, input().split()), reverse=True), 1):
    ans = max(ans, d+t)
print(ans + 1)