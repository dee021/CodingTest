def solution(dartResult):
    option = {'S':1, 'D': 2, 'T':3}
    score = []
    number = ''
    index = -1
    
    for i in dartResult:
        if ord(i) >= 65:
            index += 1
            score.append(int(number))
            number = ''
            score[index] **= option[i]
        elif i == '#':
            score[index] *= -1
        elif i == '*':
            score[index] *= 2
            if index:
                score[index-1] *= 2
        else:
            number += i
    
    return sum(score)