import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
ans = 0
for v in arr[::-1]:
    if ans > v:
        if ans%v:
            ans = (ans//v +1)*v
    else:
        ans = v
print(ans)