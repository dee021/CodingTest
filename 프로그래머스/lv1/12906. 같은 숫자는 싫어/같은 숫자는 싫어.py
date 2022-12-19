def solution(arr):
    answer = [arr[0]]
    n = arr[0]
    for i, c in enumerate(arr[1:],1):
        if n != c:
            answer.append(arr[i])
            n = c
    return answer