import sys
input = sys.stdin.readline

for _ in range(int(input())):
    c, v = map(int, input().split())
    vote = [0 for _ in range(c+1)]
    preference = [list(map(int, input().split())) for _ in range(v)]
    for y in range(v):
        vote[preference[y][0]] += 1
    ans = sorted([x for x in range(c+1)], key=lambda x:-vote[x])[:2]
    if vote[ans[0]] > v//2:
        print(ans[0], 1)
        continue
    cnt = [0,0]
    for y in range(v):
        if preference[y].index(ans[0]) < preference[y].index(ans[1]):
            cnt[0] += 1
        else:
            cnt[1] += 1
    if cnt[0] > cnt[1]:
        print(ans[0], 2)
    else:
        print(ans[1], 2)