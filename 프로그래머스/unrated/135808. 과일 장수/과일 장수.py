def solution(k, m, score):
    box = len(score)//m
    score = [score.count(x) for x in range(0,k+1)]
    answer = 0; t = 0
    for idx in range(k, 0, -1):
        if not box:
            break
        t += score[idx]
        if t >= m:
            b = min(box, t//m)
            answer += idx*m*b
            box -= b
            t %= m
    return answer