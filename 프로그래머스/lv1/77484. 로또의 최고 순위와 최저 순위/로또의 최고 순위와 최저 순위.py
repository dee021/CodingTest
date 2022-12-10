def solution(lottos, win_nums):
    answer = [6,6,5,4,3,2,1]
    index = len(set(lottos)&set(win_nums))
    zero = 0
    for n in lottos:
        if n:
            continue
        zero += 1
        
    return [answer[index+zero], answer[index]]