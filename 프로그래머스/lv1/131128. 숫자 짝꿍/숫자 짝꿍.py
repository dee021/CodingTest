from collections import Counter

def solution(X, Y):
    answer = ''
    X = Counter(X)
    Y = Counter(Y)
    for i in range(10):
        answer += str(i) * min(X[str(i)], Y[str(i)])
    if answer:
        return answer[::-1] if len(answer) - answer.count('0') else '0'
    return '-1'