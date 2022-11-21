import math

n, m, k = map(int, input().split())
t = min(n//2, m) # 팀
p = n + m - 3*t # 남는 인원
if p-k < 0:
    print(t - math.ceil(abs(p-k)/3))
else:
    print(t)