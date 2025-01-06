import sys
input = sys.stdin.readline

n = int(input())
at, bt, t = [], [], set()

for _ in range(n):
    a, b = map(int, input().split())
    at.append(a)
    bt.append(b)
    t.add(-a+b)

t = sorted(t)
opt, cnt = float('inf'), 0

for g in range(len(t)):
    case = 0
    for i in range(n):
        case += abs(at[i]+t[g]-bt[i])
    if case < opt:
        opt = case
        cnt = 1
    elif case == opt:
        cnt += 1
    if case == opt and g + 1 < len(t) and t[g+1] - t[g] > 1:
        case = 0
        for j in range(n):
            case += abs(at[j]+(t[g]+t[g+1])//2-bt[j])
        if case == opt:
            cnt += t[g+1] - t[g] - 1
        
print(cnt)