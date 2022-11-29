def solution(spell, dic):
    answer = 2
    for word in dic:
        if answer == 1:
            break
        for idx in range(len(spell)):
            if spell[idx] not in word:
                break
            if idx == len(spell) -1:
                answer = 1
    return answer