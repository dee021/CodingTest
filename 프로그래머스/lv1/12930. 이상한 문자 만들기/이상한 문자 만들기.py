def solution(s):
    w = s.upper().split()
    i, index = 0, 0
    answer = ''
    while i < len(s):
        if ord(s[i]) >= 65 and ord(s[i]) <= 122:
            i += len(w[index])
            for j in range(len(w[index])):
                if j%2:
                    answer += w[index][j].lower()
                else:
                    answer += w[index][j]
            index += 1
        else:
            answer += s[i]
            i += 1
    return answer