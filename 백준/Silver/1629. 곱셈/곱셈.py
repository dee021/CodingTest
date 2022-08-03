import sys
sys.setrecursionlimit(10**5)

def dAq(x, y):
    global c
    if y == 1:
        return x%c
    elif y == 2:
        return (x*x)%c
    elif y % 2: # odd
        y = dAq(x, (y-1)//2)
        return (y*y*x)%c
    else:
        y = dAq(x, y//2)
        return (y*y)%c

a, b, c = map(int, sys.stdin.readline().split())

ans = dAq(a, b)
print(ans)
