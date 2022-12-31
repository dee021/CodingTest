import sys
input = sys.stdin.readline

n = int(input())
for i in range(n):
    t = list(map(int, input().split()))
    print('Scenario #'+str(i+1)+':')
    a = max(t)
    t.remove(a)
    if t[0]**2 + t[1]**2 == a**2:
        print('yes')
    else:
        print('no')
    if i != n-1:
        print()