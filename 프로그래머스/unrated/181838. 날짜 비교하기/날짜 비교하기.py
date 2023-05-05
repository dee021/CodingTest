def solution(date1, date2):
    f = 0
    for i in range(3):
        if date1 < date2:
            f = 1
            break
    return f