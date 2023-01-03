def solution(sizes):
    x, n = 0, 0
    for w, h in sizes:
        x, n = max(x, max(w, h)), max(n, min(w, h))
    answer = x * n
    return answer