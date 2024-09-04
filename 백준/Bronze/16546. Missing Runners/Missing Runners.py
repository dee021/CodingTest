import sys
input = sys.stdin.readline

n = int(input())
ans = n*(n+1)//2
for k in map(int, input().split()):
    ans -= k
print(ans)