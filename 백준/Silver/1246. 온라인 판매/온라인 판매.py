n, m = map(int, input().split())
p = sorted([int(input()) for _ in range(m)], reverse=True)
price, b = 0,0
for i, c in enumerate(p,1):
    if i > n:
        break
    if i*c > b:
        b = i*c; price = c
print(price, b)