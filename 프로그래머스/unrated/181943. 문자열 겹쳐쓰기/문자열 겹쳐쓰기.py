def solution(my_string, overwrite_string, s):
    answer = list(my_string)
    answer[s:s+len(overwrite_string)] = list(overwrite_string)
    return ''.join(answer)