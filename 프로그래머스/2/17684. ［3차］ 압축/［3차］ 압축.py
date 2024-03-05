def solution(msg):
    d = {chr(x+ord('A')):x+1 for x in range(26)}
    idx, e = 27, len(msg) - 1
    answer = []
    
    cur = ''
    for i, a in enumerate(msg):
        cur += a
        if i != e:
            if cur + msg[i+1] not in d:
                d[cur + msg[i+1]] = idx
                idx += 1
                answer.append(d[cur])
                cur = ''
            else:
                continue
    if cur:
        answer.append(d[cur])
    return answer