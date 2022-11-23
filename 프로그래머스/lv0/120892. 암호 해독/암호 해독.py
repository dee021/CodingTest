def solution(cipher, code):
    answer = ''.join([cipher[n] for n in range(code-1, len(cipher), code)])
    return answer