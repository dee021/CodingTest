def solution(array, height):
    answer = list(filter(lambda x: x>height, array))
    return len(answer)