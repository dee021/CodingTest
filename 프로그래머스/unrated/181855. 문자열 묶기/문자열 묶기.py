def solution(strArr):
    ans = 0
    l = [len(s) for s in strArr]
    for n in set(l):
        if ans < l.count(n):
            ans = l.count(n)
    return ans