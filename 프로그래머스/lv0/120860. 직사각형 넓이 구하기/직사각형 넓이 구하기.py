def solution(dots):
    dots.sort()
    dots = list(map(lambda x, y: abs(x-y),dots[0], dots[-1]))
    answer = dots[0] * dots[1]
    return answer