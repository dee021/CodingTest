def solution(citations):
    l, r = 0, len(citations)
    answer = 0
    while l <= r:
        mid = (l+r)//2
        cnt = 0
        for i in citations:
            if i >= mid:
                cnt += 1
        if cnt >= mid:
            answer = max(answer, mid)
            l = mid + 1
        else:
            r = mid - 1
    return answer