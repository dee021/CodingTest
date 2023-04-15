import sys
input = sys.stdin.readline

while True:
    ans = 1
    a, *l = map(int, input().split())
    if not a:
        break
    for i in range(0,len(l),2):
        ans *= l[i]
        ans -= l[i+1]
    print(ans)