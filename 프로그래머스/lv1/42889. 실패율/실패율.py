def solution(N, stages):
    ans = []
    rateFail = {0:[]}
    for n in range(1, N+1):
        if len([x for x in stages if x>=n]):
            rate = stages.count(n)/len([x for x in stages if x>=n])
            if rate in rateFail:
                rateFail[rate].append(n)
            else:
                rateFail[rate] = [n]
        else:
            rateFail[0].append(n)
    
    for f in sorted(rateFail.keys(), reverse=True):
        if len(rateFail[f]) > 1:
            rateFail[f] = rateFail[f][::-1]
        while rateFail[f]:
            ans.append(rateFail[f].pop())
    return ans
