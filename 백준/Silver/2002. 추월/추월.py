import sys
input = sys.stdin.readline

n = int(input())
order = [input().strip() for _ in range(n)]
car = {order[x]:x for x in range(n)}
ans = 0
for i in range(n):
    k = input().strip()
    if car[k] > i:
        ans += 1
        order[car[k]] = 0
    else:
        for j in range(car[k]):
            if order[j]:
                ans += 1
                break
    order[car[k]] = 0
print(ans)