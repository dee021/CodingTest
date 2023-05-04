def solution(a, d, included):
    answer = [a+d*i for i in range(len(included)) if included[i]]
    return sum(answer)