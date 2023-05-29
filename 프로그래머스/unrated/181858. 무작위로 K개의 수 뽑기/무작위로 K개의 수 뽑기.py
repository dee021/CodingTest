def solution(arr, k):   
    answer = [arr[i] for i in range(len(arr)) if arr.index(arr[i]) == i]
    if len(answer) > k:
        del answer[k:]
    elif len(answer) < k:
        answer.extend([-1]*(k-len(answer)))
    return answer