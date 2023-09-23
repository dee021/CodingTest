def solution(answers):
    o = [1,2,3,4,5]
    t = [2,1,2,3,2,4,2,5]
    th = [3,3,1,1,2,2,4,4,5,5]
    answer = [0,0,0]
    
    for i, a in enumerate(answers):
        answer[0] += a == o[i%5]
        answer[1] += a == t[i%len(t)]
        answer[2] += a == th[i%len(th)]
    return [i+1 for i in range(3) if answer[i] == max(answer)]