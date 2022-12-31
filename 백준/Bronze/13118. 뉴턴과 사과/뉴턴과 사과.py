peo = list(map(int, input().split()))
x, y, r = map(int, input().split())

print(peo.index(x)+1 if peo.count(x) else 0)