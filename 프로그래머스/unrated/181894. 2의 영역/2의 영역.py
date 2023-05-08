def solution(arr):
    s, e = len(arr), 0
    for i, n in enumerate(arr):
        if n == 2:
            s = min(s, i)
            e = max(e, i+1)
    return arr[s:e] if s<=e else [-1]