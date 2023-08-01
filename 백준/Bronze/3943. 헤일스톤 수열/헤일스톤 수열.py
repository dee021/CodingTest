import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input()); ans = n
    while n!= 1:
        if n%2:
            n = n*3 + 1
        else:
            n //= 2
        ans = max(n, ans)
    print(ans)