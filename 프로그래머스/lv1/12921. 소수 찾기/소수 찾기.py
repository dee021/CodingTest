def solution(n):
    answer = [x for x in range(2, n+1, 1) if x == 2 or x%2]
    for i in range(len(answer)):
        if i >= len(answer) or answer[i] > n**0.5+1:
            break
        answer[i+1:] = [x for x in answer[i+1:] if x%answer[i]]
    return len(answer)