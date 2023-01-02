def solution(survey, choices):
    kf = ['RT', 'CF', 'JM', 'AN']
    mbti = {key:[0,0] for key in kf}

    answer = ''
    for i, c in enumerate(survey):
        if c not in mbti:
            c = c[::-1]; choices[i] = 8-choices[i]
        if choices[i] <= 3:
            mbti[c][0] += 4-choices[i]
        elif choices[i] >= 5:
            mbti[c][1] += choices[i]-4
    for c in kf:
        answer += c[mbti[c].index(max(mbti[c]))]
    return answer