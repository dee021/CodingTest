import sys
input = sys.stdin.readline

n = int(input())
ans = 0
d = {}
for a in map(int, input().split()):
    if a-1 in d and a in d:
        d[a] = max(d[a], d.get(a-1)+1)
    elif a-1 in d:
        d[a] = d.get(a-1)+1
    else:
        d[a] = 1
    ans = max(ans, d[a])
        
print(ans)