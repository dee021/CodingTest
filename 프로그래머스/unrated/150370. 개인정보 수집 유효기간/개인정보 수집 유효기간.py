def solution(today, terms, privacies):
    def cvt(date):
        y, m, d = map(int, date.split('.'))
        return y*12*28 + m*28 + d
    today = cvt(today)
    period = {}
    for t in terms:
        k, p = t.split()
        period[k] = int(p)*28 -1
    
    answer = []
    for i, p in enumerate(privacies):
        d, k = p.split()
        if today > cvt(d) + period[k]:
            answer.append(i+1)
    return answer