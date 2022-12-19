n, m, k = map(int, input().split())
print(n - max(m, k) + min(m, k))

# 앞뒤가 같은 카드 : o = min(m, k), x = n - max(m, k)