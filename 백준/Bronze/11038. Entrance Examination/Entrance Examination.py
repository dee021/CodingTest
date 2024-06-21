import sys
input = sys.stdin.readline

while True:
    m, s, b = map(int, input().split())
    if m == 0 == s == b:
        break
    gap, ans = 0, 0
    arr = [int(input())]
    for i in range(1, m):
        arr.append(int(input()))
        if s <= i <= b and gap <= arr[-2] - arr[-1]:
            gap = arr[-2] - arr[-1]
            ans = i
    print(ans)