import sys
input = sys.stdin.readline

while True:
    n = list(map(int, input().split()))
    if len(n) == 1:
        break
    x = n[1]-1 if n[1]%2 else n[1]-2
    ans = [1+x,2+x,n[0]-1-x,n[0]-x]
    ans.remove(n[1])
    print(*sorted(ans))