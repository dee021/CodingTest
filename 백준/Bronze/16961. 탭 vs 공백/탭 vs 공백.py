import sys
input = sys.stdin.readline
conv = lambda x: int(x) if x.isnumeric() else x == 'S'

room = [[0,0] for _ in range(366)] # room[day][tap or space]
ans = [0,0,0,0,0]

for _ in range(int(input())):
    p, s, e = map(conv, input().strip().split())
    for d in range(s-1, e):
        room[d][p] += 1
    ans[4] = max(ans[4], e-s+1)

for d in range(366):
    if (s := sum(room[d])):
        ans[0] += 1
    ans[1] = max(ans[1], s)
    if (cond := s and room[d][0] == room[d][1]):
        ans[2] += 1
    if cond:
        ans[3] = max(ans[3], s)
print(*ans, sep='\n')