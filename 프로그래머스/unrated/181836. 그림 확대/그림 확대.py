def solution(picture, k):
    answer = []
    for s in picture:
        s = s.replace('.', '.'*k).replace('x', 'x'*k)
        answer.extend([s]*k)
    return answer