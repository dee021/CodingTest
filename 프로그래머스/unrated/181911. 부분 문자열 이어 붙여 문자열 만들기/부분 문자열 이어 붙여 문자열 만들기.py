def solution(my_strings, parts):
    answer = [my_strings[i][v[0]:v[1]+1] for i, v in enumerate(parts)]
    return ''.join(answer)