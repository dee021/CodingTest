def solution(arr):
    answer = []
    for x in arr:
        answer.extend([x]*x)
    return answer