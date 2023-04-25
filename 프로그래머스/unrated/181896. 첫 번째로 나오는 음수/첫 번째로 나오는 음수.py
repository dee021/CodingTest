def solution(num_list):
    arr = [x < 0 for x in num_list]
    return [x < 0 for x in num_list].index(True) if True in arr else -1