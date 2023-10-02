import sys
input = sys.stdin.readline

arr = []
ans = 0
for _ in range(int(input())):
    s = input()
    if s.startswith('1'):
        a, s, m = map(int, s.split())
        arr.append([m, s])
    if arr:
        arr[-1][0] -= 1
        if arr[-1][0] == 0:
            ans += arr[-1][1]
            arr.pop()
print(ans)