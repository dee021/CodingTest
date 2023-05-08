def solution(n, m, section):
    answer, end = 0, 0
    l = len(section)
    idx = 0
    while idx < l:
        answer += 1
        ran = range(section[idx], section[idx]+m)
        for i in range(idx, l):
            if section[i] not in ran:
                idx = i
                break
            if i == l - 1:
                return answer