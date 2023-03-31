def solution(s):
    s = list(s[::-1])
    
    while s:
        c = [s.pop()]
        for a in s:
            c.append(a)
            while len(c)>1 and c[-1] == c[-2]:
                c.pop();c.pop()
        if len(s)+1 == len(c):
            return 0
        s = c
    return 1
                
    
    
    return answer