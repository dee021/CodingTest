def solution(sequence, k):
    answer = []
    res = 0
    l = 0
    
    for r in range(len(sequence)):
        res += sequence[r]
        if res == k:
            if not answer or r-l < answer[1]-answer[0]:
                answer = [l, r]
        while res > k and l < r:
            res -= sequence[l]
            l += 1
            if res == k:
                if not answer or r-l < answer[1]-answer[0]:
                    answer = [l, r]
    
    return answer