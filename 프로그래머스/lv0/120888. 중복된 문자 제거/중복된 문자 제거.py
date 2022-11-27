def solution(my_string):
    cset = set()
    answer = ''
    for i in my_string:
        if i not in cset:
            answer += i
            cset.add(i)
    return answer