def solution(land):
    answer = [[0,0,0,0] for _ in range(len(land))]
    answer[0] = land[0]
    
    for i in range(len(land)-1):
        before_value = max(answer[i])
        before_idx, cnt =  answer[i].index(before_value), answer[i].count(before_value)
        answer[i+1] = land[i+1]
        for idx in range(4):
            answer[i+1][idx] += before_value if idx != before_idx or cnt > 1 else max(set(answer[i]).difference(set([before_value])))
    return max(answer[-1])