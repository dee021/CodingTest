import sys
input = sys.stdin.readline

n = 1
ans = 1
for i in range(int(input())):
    n += int(input()) -1 
    ans = max(ans, n) 
print(ans)