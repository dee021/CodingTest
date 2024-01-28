def solution(cards):
    cards = [0] + cards
    answer = []
    def rnd(k):
        cnt = 0
        while cards[k]:
            cnt += 1
            temp = cards[k]
            cards[k] = 0
            k = temp
        return cnt
    
    for i in range(len(cards)):
        if cards[i]:
            answer.append(rnd(i))
            
    if len(answer) == 1:
        return 0
    
    answer.sort(reverse=True)
    print(answer)
    return answer[0] * answer[1]