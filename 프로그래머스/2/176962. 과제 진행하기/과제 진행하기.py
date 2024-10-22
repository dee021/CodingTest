from collections import deque

conv = lambda x: int(x[:2])*60 + int(x[3:])

def solution(plans):
    plans.sort(key = lambda x:x[1])
    answer = []
    cur = conv(plans[0][1])
    q = deque([[plans[0][0], int(plans[0][2])]])
    for name, start, time in plans[1:]:
        start = conv(start)
        last = start - cur
        while last > 0 and q:
            n, t = q.popleft()
            if t <= last:
                answer.append(n)
                last -= t
            else:
                t -= last
                last = 0
                q.appendleft([n, t])
        q.appendleft([name, int(time)])
        cur = start
    answer.extend([x[0] for x in q])
        
        
    return answer