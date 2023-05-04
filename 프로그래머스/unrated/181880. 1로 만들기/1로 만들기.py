from collections import deque

def memo(m):
    mem = [0 for _ in range(m+1)]
    s = deque([(1,0)])
    while s:
        n, c = s.popleft()
        if n > m:
            continue
        if not mem[n]:
            mem[n] = c
        s.extend([(n*2, c+1), (n*2+1, c+1)])
    return mem

def solution(num_list):
    mem = memo(max(num_list))
    return sum([mem[i] for i in num_list])