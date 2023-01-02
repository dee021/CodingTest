import sys
input = sys.stdin.readline

con = [1, 2, 6, 24, 120]

while True:
    fac = input().strip()[::-1]
    if fac == '0':
        break
    ans = 0
    for i in range(len(fac)):
        ans += int(fac[i]) * con[i]
    print(ans)