from collections import Counter
def solution(order):
    answer = Counter(str(order))
    return answer['3'] + answer['6'] + answer['9']