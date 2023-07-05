n, w = map(int, input().split())
price = [int(input()) for _ in range(n)]
p = price[0] # 매수단가

for i in range(1, n-1):
    if p > price[i]:
        p = price[i]
    if price[i] > price[i+1] and price[i] > p:
        w += w//p*(price[i]-p)
        p = price[i]
w += max(w//p*(price[-1]-p), 0)
print(w)