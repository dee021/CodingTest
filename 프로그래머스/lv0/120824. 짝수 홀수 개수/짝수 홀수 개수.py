def solution(num_list):
    odd, even = 0, 0
    for x in num_list:
        if x%2:
            odd += 1
        else:
            even += 1
    answer = [even, odd]
    return answer