def solution(myString, pat):
    return int(myString.lower().count(pat.lower()) > 0)