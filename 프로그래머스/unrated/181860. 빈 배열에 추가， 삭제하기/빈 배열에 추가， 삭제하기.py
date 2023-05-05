def solution(arr, flag):
    answer = []
    for i, f in enumerate(flag):
        if f:
            answer.extend([arr[i]]*(arr[i]*2))
        else:
            del answer[-1*arr[i]:]
    return answer