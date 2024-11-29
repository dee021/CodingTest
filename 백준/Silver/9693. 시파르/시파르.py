import sys
input = sys.stdin.readline
print = sys.stdout.write

def sol(k):
    ans = 0
    while k >= 5:
        ans += k//5
        k //=5
    return ans

t = 1
while True:
    n = int(input())
    if not n:
        break
    print('Case #{}: {}\n'.format(t, sol(n)))
    t += 1