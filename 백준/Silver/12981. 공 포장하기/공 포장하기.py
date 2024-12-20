r, g, b = map(int, input().split())
ans = r//3 + g//3 + b//3
r %= 3; g%= 3; b%=3
ans += min(max(r, g, b), len([x for x in [r, g ,b] if x > 0]))
print(ans)