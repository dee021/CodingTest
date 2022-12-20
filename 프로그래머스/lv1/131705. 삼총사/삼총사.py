def solution(number):
    answer = 0
    for o in range(len(number)):
        for t in range(o+1, len(number)):
            for th in range(t+1, len(number)):
                if number[o] + number[t] + number[th] == 0:
                    answer += 1
    return answer