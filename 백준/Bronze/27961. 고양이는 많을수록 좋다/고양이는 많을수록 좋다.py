cat, ans = 0, 0
n = int(input())

while cat < n:
    cat = max(cat + 1, min(cat * 2, n))
    ans += 1
print(ans)