import sys
input = sys.stdin.readline

n = int(input())
job = sorted([list(map(int, input().split())) for _ in range(n)])

cnt, day = 0, 0
for i in range(n):
    while day < job[i][0] and job[i][1] > 0:
        day += 1
        if day%7 in [6, 0]:
            continue
        job[i][1] -= 1
    if job[i][1] > 0:
        cnt += job[i][1]
        if cnt > job[i][0]:
            print(-1)
            break
else:
    print(cnt)