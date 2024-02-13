from collections import Counter
from math import factorial as ft


def solution(weights):
    cnt = Counter(weights)
    keys = sorted(cnt.keys())
    answer = 0
    
    for k in keys:
        if cnt[k] > 1:
            answer += ft(cnt[k])//2//ft(cnt[k]-2)
    
    for i, k in enumerate(keys):
        for m in [4/3, 3/2, 4/2]:
            if k * m == int(k * m) and int(k * m) in cnt:
                answer += cnt[k] * cnt[int(k*m)]
    
    return answer