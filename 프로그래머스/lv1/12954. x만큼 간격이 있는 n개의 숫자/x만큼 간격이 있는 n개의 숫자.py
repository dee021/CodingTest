def solution(x, n):
    arr = [x]
    for _ in range(n-1):
        arr.append(arr[-1]+x)
    return arr