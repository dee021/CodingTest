def solution(score):
    answer = [(x+y)/2 for x, y in score]
    return [sorted(answer, reverse=True).index(x)+1 for x in answer]