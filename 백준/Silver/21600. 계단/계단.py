import sys
input = sys.stdin.readline

n = int(input())
ans, h = 0, 0

for i in list(map(int, input().split())):
    h = min(h+1, i)
    ans = max(ans, h)  
print(ans)