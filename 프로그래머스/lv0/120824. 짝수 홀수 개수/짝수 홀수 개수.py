def solution(num_list):
    answer = [0, 0]
    for x in num_list:
        answer[x%2] += 1
    return answer