def solution(n, lost, reserve):
    for i in set(lost)&set(reserve):
        lost.remove(i)
        reserve.remove(i)
    answer = n-len(lost)
    lost.sort()
    
    for i in lost:
        if reserve.count(i-1):
            answer += 1
            reserve.remove(i-1)
        elif reserve.count(i+1):
            answer += 1
            reserve.remove(i+1)
    return answer