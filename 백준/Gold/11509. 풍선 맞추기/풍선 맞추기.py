import sys
input = sys.stdin.readline

n = int(input())
arrow = {}
ans = 0

for h in list(map(int, input().split())):
    if h in arrow and arrow[h]:
        arrow[h] -= 1
        arrow[h-1] = arrow.setdefault(h-1, 0) + 1
    else:
        ans += 1
        arrow[h-1] = arrow.setdefault(h-1, 0) + 1
print(ans)