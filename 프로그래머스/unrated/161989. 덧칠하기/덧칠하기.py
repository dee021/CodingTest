def solution(n, m, section):
    answer, end = 0, 0
    l = len(section)
    idx = 0
    while idx < l:
        f = 1
        min_range = section[idx]
        for i in range(idx, l):
            if f and section[i] in range(min_range, min_range+m):
                f = 0
                answer += 1
            if section[i] not in range(min_range, min_range+m):
                idx = i
                break
            if i == l - 1:
                end = 1
        if end:
            break
    return answer