def solution(n):
    answer = list(filter(lambda x: len(x)>2, [[f for f in range(1, b+1) if b%f == 0] for b in range(n+1)]))
    return len(answer)