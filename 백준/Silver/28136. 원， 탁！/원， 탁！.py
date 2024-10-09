import sys
input = sys.stdin.readline

n = int(input())
f, pre, ans = 0 , 0, 0
for i, num in enumerate(map(int, input().split())):
    if i == 0:
        f = num
    elif pre >= num:
        ans += 1
    if i == n-1 and f <= num:
        ans += 1
    pre = num
print(ans)