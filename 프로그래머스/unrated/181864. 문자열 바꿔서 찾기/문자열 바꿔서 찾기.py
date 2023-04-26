def solution(myString, pat):
    answer = ''
    for c in myString:
        answer += 'A' if c == 'B' else 'B'
    return int(answer.count(pat) > 0)