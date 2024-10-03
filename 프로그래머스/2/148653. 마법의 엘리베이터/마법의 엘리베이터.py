def solution(storey):
    if not storey:
        return 0
    answer = 0
    while storey:
        tmp = storey % 10
        storey //= 10
        if not tmp:
            continue
        if tmp == 5:
            answer += min(solution(storey+1), solution(storey))+5
            break
        elif 10 - tmp < tmp:
            answer += 10 - tmp
            storey += 1
        else:
            answer += tmp

    return answer