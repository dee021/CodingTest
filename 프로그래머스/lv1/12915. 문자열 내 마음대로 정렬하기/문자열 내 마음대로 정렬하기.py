def solution(strings, n):
    return sorted(strings, key=lambda s: (ord(s[n]), s))