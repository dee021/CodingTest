def solution(arr, queries):
    answer = []
    for s, e, k in queries:
        t = list(filter(lambda x: x>k, arr[s:e+1]))
        answer.append(min(t) if t else -1)
    return answer