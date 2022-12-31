from collections import Counter

def solution(k, tangerine):
    tangerine = list(Counter(tangerine).values())
    answer = 0
    for i in sorted(tangerine, reverse=True):
        k -= i
        answer += 1
        if k <= 0:
            break
    return answer