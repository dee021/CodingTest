def solution(number, k):
    answer = number[0]
    cnt = 0
    for i, n in enumerate(number[1:], 1):
        if n <= answer[-1] or cnt >= k:
            answer += n
        else:
            j = len(answer) -1
            while  max(0, len(answer)-k+cnt) <= j -1 and answer[j-1] < n:
                j -= 1
            cnt += len(answer[max(0, j):])
            answer = answer[:max(0, j)] + n
    return answer[:len(number)-k]