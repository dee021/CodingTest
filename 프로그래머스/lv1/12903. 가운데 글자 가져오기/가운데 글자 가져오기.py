def solution(s):
    ans = (len(s)-1)//2
    return s[ans:ans+(1 if len(s)%2 else 2)]