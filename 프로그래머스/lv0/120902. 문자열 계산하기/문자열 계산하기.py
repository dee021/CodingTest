def solution(my_string):
    oper = list(my_string.split())
    answer = int(oper.pop(0))
    for i in range(0, len(oper), 2):
        if oper[i] == '+':
            answer += int(oper[i+1])
        else: answer -= int(oper[i+1])
    return answer