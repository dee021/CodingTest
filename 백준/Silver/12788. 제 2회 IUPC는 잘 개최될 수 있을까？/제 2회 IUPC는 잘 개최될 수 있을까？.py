from functools import reduce

n = int(input())
m = reduce(lambda x, y: int(x)*int(y), input().split())
ans = 0
for p in sorted(map(int, input().split()), reverse=True):
    if m <= 0:
        break
    ans += 1;m -= p
print(ans if m <= 0 else 'STRESS')