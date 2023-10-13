import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n, k, myId, m = map(int, input().split())
    tScore = {}
    log = [[0,0] for _ in range(n)]
    for i in range(m):
        team, qNo, s = map(int, input().split())
        if team not in tScore:
            tScore.setdefault(team, [0 for _ in range(k)])[qNo-1] = s
        elif tScore[team][qNo-1] < s:
            tScore[team][qNo-1] = s
        log[team-1][0] += 1
        log[team-1][1] = i
    rank = [[sum(tScore[x]), *log[x-1]] for x in range(1, n+1)]
    rank = {i:sorted(rank, key=lambda x:(-x[0], x[1], x[2])).index(rank[i])+1 for i in range(n)}
    print(rank[myId-1])