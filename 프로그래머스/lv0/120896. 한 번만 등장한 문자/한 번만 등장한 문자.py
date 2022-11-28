from collections import Counter

def solution(s):
    chars = Counter(s)
    answer = sorted([key for key in chars.keys() if chars[key] == 1])
    return ''.join(answer)