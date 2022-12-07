def solution(babbling):
    s = ["aya", "ye", "woo", "ma"]
    answer = 0
    for word in babbling:
        w = ''
        l = ''
        for i in word:
            w += i
            if s.count(w):
                if l != w:
                    l = w
                    w = ''
        if not w:
            answer += 1
    return answer