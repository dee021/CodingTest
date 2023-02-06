from functools import reduce

ans = 0
n = int(input())
while n > 9:
    ans += 1
    n = reduce(lambda x, y:int(x)*int(y), str(n))
print(ans)