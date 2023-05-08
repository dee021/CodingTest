def solution(my_string):
    answer = [0 for _ in range(52)]
    A = -1*ord('A')
    a = -1*ord('a') + 26
    for c in my_string:
        if 'A' <= c <= 'Z':
            answer[ord(c)+A] += 1
        else:
            answer[ord(c)+a] += 1
    return answer