ans = []
for _ in range(int(input())):
    a, b = map(int, input().split())
    if a <= b:
        ans.append(b)

print(min(ans)) if ans else print(-1)