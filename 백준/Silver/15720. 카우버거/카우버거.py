b, c, d = map(int, input().split())
burger = sorted(map(int, input().split()), reverse=True)
side = sorted(map(int, input().split()), reverse=True)
drink = sorted(map(int, input().split()), reverse=True)
m = min(b, c, d)
ans = sum(burger) + sum(side) + sum(drink)
print(ans)
ans -= (sum(burger[:m]) + sum(side[:m]) + sum(drink[:m]))//10
print(ans)