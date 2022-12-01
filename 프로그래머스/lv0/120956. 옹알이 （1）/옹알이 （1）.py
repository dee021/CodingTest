def solution(babbling):
    word = ["aya", "ye", "woo", "ma"]
    answer = 0
    for s in babbling:
        w = ''
        for c in s:
            w += c
            if word.count(w):
                w = ''
        if w == '':
            answer += 1
    return answer