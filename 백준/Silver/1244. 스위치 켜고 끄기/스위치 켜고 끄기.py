s = int(input())
state = [0] + list(map(bool, map(int, input().split())))
n = int(input())
student = [list(map(int, input().split())) for _ in range(n)]

for r in range(n):
    gen, num = student[r]
    if gen == 1: # m
        for i in range(1,s//num+1):
            state[i*num] = not state[i*num]
    else: # w
        state[num] = not state[num]
        m = min(s-num, num-1)
        tmp = 1
        while tmp <= m:
            if state[num-tmp] == state[num+tmp]:
                state[num-tmp] = not state[num-tmp]
                state[num+tmp] = not state[num+tmp]
                tmp += 1
            else:
                break
del state[0]
for i in range(s//20+1):
    print(*map(int, state[:min(len(state), 20)]))
    del state[:20]