import sys
input = sys.stdin.readline

for _ in range(int(input())):
    ans = 0
    a, b = map(int, input().split())
    for n in range(a, b+1):
        ans += str(n).count('0')
    print(ans)