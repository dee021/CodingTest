def solution(phone_number):
    answer = '*' * len(phone_number[0:-4]) + phone_number[-4:]
    return answer