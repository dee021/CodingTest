import sys
from itertools import combinations

n = int(input())
s = [0 for _ in range(n)]
for i in range(n):
    s[i] = list(map(int, sys.stdin.readline().split()))

player = [i for i in range(1, n)]
st = list(combinations(player, (n//2)-1))
# st : 0번 선수와 함께 팀이 될 후보 조합들

def sol(start):
    global s, n
    link = list(set([x for x in range(1, n)]) - set(start))
    start = list(start)
    start.append(0)
    def oper(team):
        m = len(team)
        res = 0
        for i in range(m):
            for j in range(i+1, m, 1):
                res += s[team[i]][team[j]]
                res += s[team[j]][team[i]]
        return res
    teams = list([start, link])
    res = list(map(oper, teams))
    return abs(res[0]-res[1])

ans = min(list(map(sol, st)))
print(ans)