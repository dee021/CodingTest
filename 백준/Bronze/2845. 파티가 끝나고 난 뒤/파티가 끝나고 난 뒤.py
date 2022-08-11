def dif(num):return num - ans

l, p = map(int, input().split())
ans = l*p
print(*list(map(dif, list(map(int, input().split())))))
