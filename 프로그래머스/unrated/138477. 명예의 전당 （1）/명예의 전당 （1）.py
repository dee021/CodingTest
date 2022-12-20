def solution(k, score):
    answer = []; lst = []
    for i in range(len(score)):
        if i+1 <= k:
            lst.append(score[i])
        else:
            lst[lst.index(min(lst))] = max(min(lst), score[i])
        answer.append(min(lst))
    return answer