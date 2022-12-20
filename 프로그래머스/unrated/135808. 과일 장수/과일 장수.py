def solution(k, m, score):
    score = sorted(score, reverse=True)[m-1::m]
    return sum(score)*m