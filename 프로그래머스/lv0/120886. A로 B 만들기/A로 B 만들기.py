def solution(before, after):
    answer = 1
    for c in set(after):
        if after.count(c) > before.count(c):
            answer = 0
            break
    return answer