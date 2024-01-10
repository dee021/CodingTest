import sys
input = sys.stdin.readline

def sol(m, s):
    rt = m*60 + s
    if score[0] > score[1]:
        t = 0
    elif score[0] < score[1]:
        t = 1
    else:
        return rt
    ans[t] += rt - cur
    return rt


n = int(input())
score, ans = [0,0], [0,0]
cur = 0

for _ in range(n):
    team, time = input().strip().split()
    cur = sol(*map(int, time.split(':')))
    score[int(team)-1] += 1
sol(48, 0)
print('\n'.join(['{:0>2}:{:0>2}'.format(ans[i]//60, ans[i]%60) for i in range(2)]))
