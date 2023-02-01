a, b = map(int, input().split())
ans = abs(a-b)
for _ in range(int(input())):
    ans = min(ans, abs(b-int(input()))+1)
print(ans)