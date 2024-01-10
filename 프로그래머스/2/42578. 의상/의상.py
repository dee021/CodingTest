def solution(clothes):
    kind, answer = {}, 1
    
    for n, k in clothes:
        kind[k] = kind.setdefault(k, 0) + 1

    for k in kind.keys():
        answer *= 1+kind[k]
    
    return answer - 1