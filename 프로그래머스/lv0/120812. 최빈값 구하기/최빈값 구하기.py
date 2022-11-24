from collections import Counter

def solution(array):
    if not len(array):
        return -1
    cnt = Counter(array)
    if list(cnt.values()).count(max(cnt.values())) > 1:
        return -1
    answer = cnt.most_common(1)[0][0]
    return answer