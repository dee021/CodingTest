def solution(my_string):
    answer = 0
    flag = 0; tmp = 0
    for c in my_string:
        if c.isnumeric():
            tmp = tmp*10 + int(c) if flag else int(c)
            flag = 1
        else:
            if flag:
                answer += tmp
                flag = tmp = 0
    if tmp: answer += tmp
    return answer