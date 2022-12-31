def solution(s):
    answer = 0
    cnt = [0,0]
    for i in range(len(s)):
        if cnt == [0,0]:
            x = s[i]
        if s[i] == x:
            cnt[0] += 1
        else:
            cnt[1] += 1
        if cnt[0] == cnt[1]:
            cnt = [0,0]
            answer += 1
    if cnt.count(0) < 2:
        answer += 1
    return answer