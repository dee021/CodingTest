ans = 3
a, b, c = sorted(map(int, input().split()))
if a + b == c:
    ans = 1
elif a * b == c:
    ans = 2
print(ans)