def solution(s):
    s = list(s.split())
    answer = []
    for idx in range(len(s)):
        if s[idx] == 'Z' and answer:
            answer.pop()
        else:
            answer.append(int(s[idx]))
    return sum(answer)