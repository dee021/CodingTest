def move(state, start, end):
    l = state[start] 
    dif = limit[end] - state[end]
    if dif <= l:
        state[start] -= dif
        state[end] += dif
    else:
        state[start] = 0
        state[end] += l
    return state

def sol(state):
    if tuple(state) not in ans:
        ans.add(tuple(state))
    else:
        return

    for s in range(3):
        for e in ({0,1,2} - {s}):
            if state[s] and state[e] < limit[e]:
                sol(move(state.copy(), s, e))

limit = list(map(int, input().split()))
ans = set()
sol([0,0,limit[2]])
ans = list(ans)
print(*sorted([ans[i][2] for i in range(len(ans)) if ans[i][0] == 0]))