import sys
input = sys.stdin.readline

pack = [] # 패키지 가격
one = [] # 낱개 가격
n, m = map(int, input().split())
k = n//6
flag = 0
if n%6:
    flag += 1

for _ in range(m):
    p, o = map(int, input().split())
    pack.append(min(p*k, o*k*6))
    if flag:
        one.append(min(p, o*(n%6)))

ans = min(pack) + min(one) if flag else min(pack)
print(ans)