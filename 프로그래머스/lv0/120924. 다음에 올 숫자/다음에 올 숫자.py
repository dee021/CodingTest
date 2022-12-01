def solution(common):
    d = common[1]-common[0]
    r = common[1]/common[0] if common[0] else 0
    
    for i in range(len(common)-1):
        if common[i+1] - common[i] != d:
            return common[-1] * r
    return common[-1] + d