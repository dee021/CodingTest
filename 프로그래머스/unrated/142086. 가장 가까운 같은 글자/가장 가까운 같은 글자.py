def solution(s):
    answer = []
    for i,c in enumerate(s):
        if s.index(c) == i:
            answer.append(-1)
        else:
            answer.append(s[i-1::-1].index(c)+1)
    
    return answer